package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AccompanistLibraryAccessors laccForAccompanistLibraryAccessors = new AccompanistLibraryAccessors(owner);
    private final CoilLibraryAccessors laccForCoilLibraryAccessors = new CoilLibraryAccessors(owner);
    private final ComposeLibraryAccessors laccForComposeLibraryAccessors = new ComposeLibraryAccessors(owner);
    private final FirebaseLibraryAccessors laccForFirebaseLibraryAccessors = new FirebaseLibraryAccessors(owner);
    private final HiltLibraryAccessors laccForHiltLibraryAccessors = new HiltLibraryAccessors(owner);
    private final LottieLibraryAccessors laccForLottieLibraryAccessors = new LottieLibraryAccessors(owner);
    private final OtherLibraryAccessors laccForOtherLibraryAccessors = new OtherLibraryAccessors(owner);
    private final PagingLibraryAccessors laccForPagingLibraryAccessors = new PagingLibraryAccessors(owner);
    private final Retrofit2LibraryAccessors laccForRetrofit2LibraryAccessors = new Retrofit2LibraryAccessors(owner);
    private final RoomLibraryAccessors laccForRoomLibraryAccessors = new RoomLibraryAccessors(owner);
    private final SurfLibraryAccessors laccForSurfLibraryAccessors = new SurfLibraryAccessors(owner);
    private final TestLibraryAccessors laccForTestLibraryAccessors = new TestLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers) {
        super(config, providers);
    }

    /**
     * Returns the group of libraries at accompanist
     */
    public AccompanistLibraryAccessors getAccompanist() { return laccForAccompanistLibraryAccessors; }

    /**
     * Returns the group of libraries at coil
     */
    public CoilLibraryAccessors getCoil() { return laccForCoilLibraryAccessors; }

    /**
     * Returns the group of libraries at compose
     */
    public ComposeLibraryAccessors getCompose() { return laccForComposeLibraryAccessors; }

    /**
     * Returns the group of libraries at firebase
     */
    public FirebaseLibraryAccessors getFirebase() { return laccForFirebaseLibraryAccessors; }

    /**
     * Returns the group of libraries at hilt
     */
    public HiltLibraryAccessors getHilt() { return laccForHiltLibraryAccessors; }

    /**
     * Returns the group of libraries at lottie
     */
    public LottieLibraryAccessors getLottie() { return laccForLottieLibraryAccessors; }

    /**
     * Returns the group of libraries at other
     */
    public OtherLibraryAccessors getOther() { return laccForOtherLibraryAccessors; }

    /**
     * Returns the group of libraries at paging
     */
    public PagingLibraryAccessors getPaging() { return laccForPagingLibraryAccessors; }

    /**
     * Returns the group of libraries at retrofit2
     */
    public Retrofit2LibraryAccessors getRetrofit2() { return laccForRetrofit2LibraryAccessors; }

    /**
     * Returns the group of libraries at room
     */
    public RoomLibraryAccessors getRoom() { return laccForRoomLibraryAccessors; }

    /**
     * Returns the group of libraries at surf
     */
    public SurfLibraryAccessors getSurf() { return laccForSurfLibraryAccessors; }

    /**
     * Returns the group of libraries at test
     */
    public TestLibraryAccessors getTest() { return laccForTestLibraryAccessors; }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    public static class AccompanistLibraryAccessors extends SubDependencyFactory {

        public AccompanistLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for insets (com.google.accompanist:accompanist-insets)
             * This dependency was declared in catalog accompanist.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInsets() { return create("accompanist-insets"); }

            /**
             * Creates a dependency provider for pager (com.google.accompanist:accompanist-pager)
             * This dependency was declared in catalog accompanist.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPager() { return create("accompanist-pager"); }

            /**
             * Creates a dependency provider for swiperefresh (com.google.accompanist:accompanist-swiperefresh)
             * This dependency was declared in catalog accompanist.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSwiperefresh() { return create("accompanist-swiperefresh"); }

            /**
             * Creates a dependency provider for systemuicontroller (com.google.accompanist:accompanist-systemuicontroller)
             * This dependency was declared in catalog accompanist.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSystemuicontroller() { return create("accompanist-systemuicontroller"); }

    }

    public static class CoilLibraryAccessors extends SubDependencyFactory {

        public CoilLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
             * This dependency was declared in catalog coil.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppcompat() { return create("coil-appcompat"); }

            /**
             * Creates a dependency provider for compose (io.coil-kt:coil-compose)
             * This dependency was declared in catalog coil.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("coil-compose"); }

    }

    public static class ComposeLibraryAccessors extends SubDependencyFactory {

        public ComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for activity (androidx.activity:activity-compose)
             * This dependency was declared in catalog compose.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getActivity() { return create("compose-activity"); }

            /**
             * Creates a dependency provider for constraintlayout (androidx.constraintlayout:constraintlayout-compose)
             * This dependency was declared in catalog compose.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConstraintlayout() { return create("compose-constraintlayout"); }

            /**
             * Creates a dependency provider for icons (androidx.compose.material:material-icons-extended)
             * This dependency was declared in catalog compose.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIcons() { return create("compose-icons"); }

            /**
             * Creates a dependency provider for material (androidx.compose.material:material)
             * This dependency was declared in catalog compose.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() { return create("compose-material"); }

            /**
             * Creates a dependency provider for material3 (androidx.compose.material3:material3)
             * This dependency was declared in catalog compose.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial3() { return create("compose-material3"); }

            /**
             * Creates a dependency provider for tooling (androidx.compose.ui:ui-tooling-preview)
             * This dependency was declared in catalog compose.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTooling() { return create("compose-tooling"); }

            /**
             * Creates a dependency provider for ui (androidx.compose.ui:ui)
             * This dependency was declared in catalog compose.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUi() { return create("compose-ui"); }

    }

    public static class FirebaseLibraryAccessors extends SubDependencyFactory {

        public FirebaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for analytics (com.google.firebase:firebase-analytics)
             * This dependency was declared in catalog firebase.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnalytics() { return create("firebase-analytics"); }

            /**
             * Creates a dependency provider for crashlytics (com.google.firebase:firebase-crashlytics)
             * This dependency was declared in catalog firebase.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCrashlytics() { return create("firebase-crashlytics"); }

    }

    public static class HiltLibraryAccessors extends SubDependencyFactory {

        public HiltLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (com.google.dagger:hilt-android)
             * This dependency was declared in catalog hilt.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("hilt-android"); }

            /**
             * Creates a dependency provider for compiler (androidx.hilt:hilt-compiler)
             * This dependency was declared in catalog hilt.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("hilt-compiler"); }

            /**
             * Creates a dependency provider for dagger (com.google.dagger:hilt-compiler)
             * This dependency was declared in catalog hilt.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDagger() { return create("hilt-dagger"); }

            /**
             * Creates a dependency provider for navigation (androidx.hilt:hilt-navigation-compose)
             * This dependency was declared in catalog hilt.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNavigation() { return create("hilt-navigation"); }

    }

    public static class LottieLibraryAccessors extends SubDependencyFactory {

        public LottieLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (com.airbnb.android:lottie-compose)
             * This dependency was declared in catalog lottie.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("lottie-compose"); }

            /**
             * Creates a dependency provider for core (com.airbnb.android:lottie)
             * This dependency was declared in catalog lottie.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("lottie-core"); }

    }

    public static class OtherLibraryAccessors extends SubDependencyFactory {

        public OtherLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for anr (com.github.anrwatchdog:anrwatchdog)
             * This dependency was declared in catalog other.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnr() { return create("other-anr"); }

            /**
             * Creates a dependency provider for reflection (org.jetbrains.kotlin:kotlin-reflect)
             * This dependency was declared in catalog other.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getReflection() { return create("other-reflection"); }

            /**
             * Creates a dependency provider for startup (androidx.startup:startup-runtime)
             * This dependency was declared in catalog other.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getStartup() { return create("other-startup"); }

            /**
             * Creates a dependency provider for timber (com.jakewharton.timber:timber)
             * This dependency was declared in catalog other.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTimber() { return create("other-timber"); }

    }

    public static class PagingLibraryAccessors extends SubDependencyFactory {

        public PagingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.paging:paging-compose)
             * This dependency was declared in catalog paging.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("paging-core"); }

    }

    public static class Retrofit2LibraryAccessors extends SubDependencyFactory {

        public Retrofit2LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for converter (com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter)
             * This dependency was declared in catalog retrofit.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConverter() { return create("retrofit2-converter"); }

            /**
             * Creates a dependency provider for logging (com.squareup.okhttp3:logging-interceptor)
             * This dependency was declared in catalog retrofit.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLogging() { return create("retrofit2-logging"); }

            /**
             * Creates a dependency provider for retrofit (com.squareup.retrofit2:retrofit)
             * This dependency was declared in catalog retrofit.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRetrofit() { return create("retrofit2-retrofit"); }

            /**
             * Creates a dependency provider for serialization (org.jetbrains.kotlinx:kotlinx-serialization-json)
             * This dependency was declared in catalog retrofit.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSerialization() { return create("retrofit2-serialization"); }

    }

    public static class RoomLibraryAccessors extends SubDependencyFactory {

        public RoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (androidx.room:room-compiler)
             * This dependency was declared in catalog room.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("room-compiler"); }

            /**
             * Creates a dependency provider for core (androidx.room:room-runtime)
             * This dependency was declared in catalog room.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("room-core"); }

            /**
             * Creates a dependency provider for ktx (androidx.room:room-ktx)
             * This dependency was declared in catalog room.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() { return create("room-ktx"); }

            /**
             * Creates a dependency provider for sqlcipher (net.zetetic:android-database-sqlcipher)
             * This dependency was declared in catalog room.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSqlcipher() { return create("room-sqlcipher"); }

            /**
             * Creates a dependency provider for sqlite (androidx.sqlite:sqlite)
             * This dependency was declared in catalog room.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSqlite() { return create("room-sqlite"); }

    }

    public static class SurfLibraryAccessors extends SubDependencyFactory {

        public SurfLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for accompanist (ru.surfstudio.compose:accompanist)
             * This dependency was declared in catalog surf.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAccompanist() { return create("surf-accompanist"); }

            /**
             * Creates a dependency provider for forms (ru.surfstudio.compose:forms)
             * This dependency was declared in catalog surf.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getForms() { return create("surf-forms"); }

            /**
             * Creates a dependency provider for logger (ru.surfstudio.android:logger)
             * This dependency was declared in catalog surf.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLogger() { return create("surf-logger"); }

            /**
             * Creates a dependency provider for modifier (ru.surfstudio.compose:modifier-ext)
             * This dependency was declared in catalog surf.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getModifier() { return create("surf-modifier"); }

            /**
             * Creates a dependency provider for response (ru.surfstudio.compose:response-result)
             * This dependency was declared in catalog surf.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getResponse() { return create("surf-response"); }

            /**
             * Creates a dependency provider for routing (ru.surfstudio.compose:routing)
             * This dependency was declared in catalog surf.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRouting() { return create("surf-routing"); }

    }

    public static class TestLibraryAccessors extends SubDependencyFactory {
        private final TestComposeLibraryAccessors laccForTestComposeLibraryAccessors = new TestComposeLibraryAccessors(owner);

        public TestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit (junit:junit)
             * This dependency was declared in catalog tests.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit() { return create("test-junit"); }

            /**
             * Creates a dependency provider for mockito (org.mockito:mockito-core)
             * This dependency was declared in catalog tests.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMockito() { return create("test-mockito"); }

            /**
             * Creates a dependency provider for mockwebserver (com.squareup.okhttp3:mockwebserver)
             * This dependency was declared in catalog tests.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMockwebserver() { return create("test-mockwebserver"); }

        /**
         * Returns the group of libraries at test.compose
         */
        public TestComposeLibraryAccessors getCompose() { return laccForTestComposeLibraryAccessors; }

    }

    public static class TestComposeLibraryAccessors extends SubDependencyFactory {

        public TestComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for junit4 (androidx.compose.ui:ui-test-junit4)
             * This dependency was declared in catalog tests.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJunit4() { return create("test-compose-junit4"); }

            /**
             * Creates a dependency provider for manifest (androidx.compose.ui:ui-test-manifest)
             * This dependency was declared in catalog tests.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getManifest() { return create("test-compose-manifest"); }

    }

    public static class VersionAccessors extends VersionFactory {

        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: accompanist (0.20.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getAccompanist() { return getVersion("accompanist"); }

            /**
             * Returns the version associated to this alias: activityCompose (1.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getActivityCompose() { return getVersion("activityCompose"); }

            /**
             * Returns the version associated to this alias: analytics (20.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getAnalytics() { return getVersion("analytics"); }

            /**
             * Returns the version associated to this alias: androidResponseResult (0.0.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getAndroidResponseResult() { return getVersion("androidResponseResult"); }

            /**
             * Returns the version associated to this alias: anrWatchDog (1.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getAnrWatchDog() { return getVersion("anrWatchDog"); }

            /**
             * Returns the version associated to this alias: appcompatVersion (1.3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getAppcompatVersion() { return getVersion("appcompatVersion"); }

            /**
             * Returns the version associated to this alias: coilVersion (1.3.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getCoilVersion() { return getVersion("coilVersion"); }

            /**
             * Returns the version associated to this alias: compose (1.0.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getCompose() { return getVersion("compose"); }

            /**
             * Returns the version associated to this alias: composeForms (0.0.17)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getComposeForms() { return getVersion("composeForms"); }

            /**
             * Returns the version associated to this alias: composeModifierExt (0.0.12)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getComposeModifierExt() { return getVersion("composeModifierExt"); }

            /**
             * Returns the version associated to this alias: composeRouting (0.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getComposeRouting() { return getVersion("composeRouting"); }

            /**
             * Returns the version associated to this alias: constraintLayout (1.0.0-beta02)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getConstraintLayout() { return getVersion("constraintLayout"); }

            /**
             * Returns the version associated to this alias: crashlytics (18.2.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getCrashlytics() { return getVersion("crashlytics"); }

            /**
             * Returns the version associated to this alias: hilt (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getHilt() { return getVersion("hilt"); }

            /**
             * Returns the version associated to this alias: hiltComposeNavigation (1.0.0-alpha03)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getHiltComposeNavigation() { return getVersion("hiltComposeNavigation"); }

            /**
             * Returns the version associated to this alias: hiltCore (2.38.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getHiltCore() { return getVersion("hiltCore"); }

            /**
             * Returns the version associated to this alias: kotlinVersion (1.5.31)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getKotlinVersion() { return getVersion("kotlinVersion"); }

            /**
             * Returns the version associated to this alias: ktlint (0.42.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getKtlint() { return getVersion("ktlint"); }

            /**
             * Returns the version associated to this alias: loggingInterceptor (4.9.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getLoggingInterceptor() { return getVersion("loggingInterceptor"); }

            /**
             * Returns the version associated to this alias: lottieVersions (4.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getLottieVersions() { return getVersion("lottieVersions"); }

            /**
             * Returns the version associated to this alias: material3 (1.0.0-alpha01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getMaterial3() { return getVersion("material3"); }

            /**
             * Returns the version associated to this alias: mockWebServer (4.9.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getMockWebServer() { return getVersion("mockWebServer"); }

            /**
             * Returns the version associated to this alias: mockitoCore (3.10.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getMockitoCore() { return getVersion("mockitoCore"); }

            /**
             * Returns the version associated to this alias: pagingCompose (1.0.0-alpha12)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getPagingCompose() { return getVersion("pagingCompose"); }

            /**
             * Returns the version associated to this alias: retrofitVersion (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getRetrofitVersion() { return getVersion("retrofitVersion"); }

            /**
             * Returns the version associated to this alias: roomVersion (2.4.0-alpha04)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getRoomVersion() { return getVersion("roomVersion"); }

            /**
             * Returns the version associated to this alias: startupVersion (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getStartupVersion() { return getVersion("startupVersion"); }

            /**
             * Returns the version associated to this alias: surfAccompanist (0.0.12)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getSurfAccompanist() { return getVersion("surfAccompanist"); }

            /**
             * Returns the version associated to this alias: surfLogger (0.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getSurfLogger() { return getVersion("surfLogger"); }

            /**
             * Returns the version associated to this alias: timberVersion (5.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog versions.toml
             */
            public Provider<String> getTimberVersion() { return getVersion("timberVersion"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a dependency bundle provider for accompanist which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.google.accompanist:accompanist-insets</li>
             *    <li>com.google.accompanist:accompanist-pager</li>
             *    <li>com.google.accompanist:accompanist-swiperefresh</li>
             *    <li>com.google.accompanist:accompanist-systemuicontroller</li>
             * </ul>
             * This bundle was declared in catalog accompanist.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getAccompanist() { return createBundle("accompanist"); }

            /**
             * Creates a dependency bundle provider for coil which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.coil-kt:coil-compose</li>
             *    <li>androidx.appcompat:appcompat</li>
             * </ul>
             * This bundle was declared in catalog coil.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getCoil() { return createBundle("coil"); }

            /**
             * Creates a dependency bundle provider for compose which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.compose.material:material</li>
             *    <li>androidx.compose.material3:material3</li>
             *    <li>androidx.compose.ui:ui</li>
             *    <li>androidx.compose.ui:ui-tooling-preview</li>
             *    <li>androidx.activity:activity-compose</li>
             *    <li>androidx.compose.material:material-icons-extended</li>
             *    <li>androidx.constraintlayout:constraintlayout-compose</li>
             * </ul>
             * This bundle was declared in catalog compose.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getCompose() { return createBundle("compose"); }

            /**
             * Creates a dependency bundle provider for firebase which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.google.firebase:firebase-analytics</li>
             *    <li>com.google.firebase:firebase-crashlytics</li>
             * </ul>
             * This bundle was declared in catalog firebase.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getFirebase() { return createBundle("firebase"); }

            /**
             * Creates a dependency bundle provider for hilt which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.google.dagger:hilt-android</li>
             *    <li>androidx.hilt:hilt-navigation-compose</li>
             * </ul>
             * This bundle was declared in catalog hilt.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getHilt() { return createBundle("hilt"); }

            /**
             * Creates a dependency bundle provider for hiltKapt which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.google.dagger:hilt-compiler</li>
             *    <li>androidx.hilt:hilt-compiler</li>
             * </ul>
             * This bundle was declared in catalog hilt.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getHiltKapt() { return createBundle("hiltKapt"); }

            /**
             * Creates a dependency bundle provider for lottie which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.airbnb.android:lottie</li>
             *    <li>com.airbnb.android:lottie-compose</li>
             * </ul>
             * This bundle was declared in catalog lottie.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getLottie() { return createBundle("lottie"); }

            /**
             * Creates a dependency bundle provider for other which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.jakewharton.timber:timber</li>
             *    <li>androidx.startup:startup-runtime</li>
             *    <li>org.jetbrains.kotlin:kotlin-reflect</li>
             *    <li>com.github.anrwatchdog:anrwatchdog</li>
             * </ul>
             * This bundle was declared in catalog other.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getOther() { return createBundle("other"); }

            /**
             * Creates a dependency bundle provider for paging which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.paging:paging-compose</li>
             * </ul>
             * This bundle was declared in catalog paging.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getPaging() { return createBundle("paging"); }

            /**
             * Creates a dependency bundle provider for retrofit2 which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.jetbrains.kotlinx:kotlinx-serialization-json</li>
             *    <li>com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter</li>
             *    <li>com.squareup.retrofit2:retrofit</li>
             *    <li>com.squareup.okhttp3:logging-interceptor</li>
             * </ul>
             * This bundle was declared in catalog retrofit.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getRetrofit2() { return createBundle("retrofit2"); }

            /**
             * Creates a dependency bundle provider for room which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.room:room-runtime</li>
             *    <li>androidx.room:room-ktx</li>
             *    <li>net.zetetic:android-database-sqlcipher</li>
             *    <li>androidx.sqlite:sqlite</li>
             * </ul>
             * This bundle was declared in catalog room.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getRoom() { return createBundle("room"); }

            /**
             * Creates a dependency bundle provider for roomKapt which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.room:room-compiler</li>
             * </ul>
             * This bundle was declared in catalog room.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getRoomKapt() { return createBundle("roomKapt"); }

            /**
             * Creates a dependency bundle provider for surf which is an aggregate for the following dependencies:
             * <ul>
             *    <li>ru.surfstudio.compose:modifier-ext</li>
             *    <li>ru.surfstudio.compose:response-result</li>
             *    <li>ru.surfstudio.compose:routing</li>
             *    <li>ru.surfstudio.compose:accompanist</li>
             *    <li>ru.surfstudio.compose:forms</li>
             *    <li>ru.surfstudio.android:logger</li>
             * </ul>
             * This bundle was declared in catalog surf.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getSurf() { return createBundle("surf"); }

            /**
             * Creates a dependency bundle provider for test which is an aggregate for the following dependencies:
             * <ul>
             *    <li>junit:junit</li>
             *    <li>com.squareup.okhttp3:mockwebserver</li>
             *    <li>org.mockito:mockito-core</li>
             * </ul>
             * This bundle was declared in catalog tests.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getTest() { return createBundle("test"); }

            /**
             * Creates a dependency bundle provider for testAndroid which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.compose.ui:ui-test-junit4</li>
             * </ul>
             * This bundle was declared in catalog tests.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getTestAndroid() { return createBundle("testAndroid"); }

            /**
             * Creates a dependency bundle provider for testDebug which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.compose.ui:ui-test-manifest</li>
             * </ul>
             * This bundle was declared in catalog tests.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getTestDebug() { return createBundle("testDebug"); }

    }

}
