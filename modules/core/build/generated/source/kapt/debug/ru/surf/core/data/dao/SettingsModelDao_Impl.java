package ru.surf.core.data.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import ru.surf.core.data.models.SettingsModel;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SettingsModelDao_Impl implements SettingsModelDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SettingsModel> __insertionAdapterOfSettingsModel;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public SettingsModelDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSettingsModel = new EntityInsertionAdapter<SettingsModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `SettingsModel` (`id`,`value`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SettingsModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getValue() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getValue());
        }
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM SettingsModel";
        return _query;
      }
    };
  }

  @Override
  public Object insertModels(final SettingsModel[] models,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSettingsModel.insert(models);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object clear(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClear.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<SettingsModel>> getModels() {
    final String _sql = "SELECT * FROM SettingsModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"SettingsModel"}, new Callable<List<SettingsModel>>() {
      @Override
      public List<SettingsModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
          final List<SettingsModel> _result = new ArrayList<SettingsModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SettingsModel _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpValue;
            if (_cursor.isNull(_cursorIndexOfValue)) {
              _tmpValue = null;
            } else {
              _tmpValue = _cursor.getString(_cursorIndexOfValue);
            }
            _item = new SettingsModel(_tmpId,_tmpValue);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
