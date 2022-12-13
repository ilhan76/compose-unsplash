package ru.surf.users.data.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
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
import ru.surf.users.data.models.UserModel;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserModelDao_Impl implements UserModelDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserModel> __insertionAdapterOfUserModel;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public UserModelDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserModel = new EntityInsertionAdapter<UserModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `UserModel` (`id`,`name`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM UserModel";
        return _query;
      }
    };
  }

  @Override
  public Object insertModels(final UserModel[] models,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserModel.insert(models);
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
  public PagingSource<Integer, UserModel> pagingSource() {
    final String _sql = "SELECT * FROM UserModel ORDER BY CAST(id AS INT)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new DataSource.Factory<Integer, UserModel>() {
      @Override
      public LimitOffsetDataSource<UserModel> create() {
        return new LimitOffsetDataSource<UserModel>(__db, _statement, false, false , "UserModel") {
          @Override
          protected List<UserModel> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
            final List<UserModel> _res = new ArrayList<UserModel>(cursor.getCount());
            while(cursor.moveToNext()) {
              final UserModel _item;
              final String _tmpId;
              if (cursor.isNull(_cursorIndexOfId)) {
                _tmpId = null;
              } else {
                _tmpId = cursor.getString(_cursorIndexOfId);
              }
              final String _tmpName;
              if (cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = cursor.getString(_cursorIndexOfName);
              }
              _item = new UserModel(_tmpId,_tmpName);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    }.asPagingSourceFactory().invoke();
  }

  @Override
  public Flow<UserModel> getModel(final String id) {
    final String _sql = "SELECT * FROM UserModel WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"UserModel"}, new Callable<UserModel>() {
      @Override
      public UserModel call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final UserModel _result;
          if(_cursor.moveToFirst()) {
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            _result = new UserModel(_tmpId,_tmpName);
          } else {
            _result = null;
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

  @Override
  public Object count(final Continuation<? super Integer> continuation) {
    final String _sql = "SELECT COUNT(*) FROM UserModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
