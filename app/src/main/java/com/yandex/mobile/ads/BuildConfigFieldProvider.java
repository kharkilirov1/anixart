package com.yandex.mobile.ads;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u001c\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u000e\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\u001a\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001c\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\u0007R\u001a\u0010\u001f\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u0002\u001a\u0004\b!\u0010\u0007R\u001a\u0010\"\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0002\u001a\u0004\b$\u0010\u0007R\u001a\u0010%\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0002\u001a\u0004\b'\u0010\u0007R\u001a\u0010(\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\u0002\u001a\u0004\b*\u0010\u0007¨\u0006+"}, m31884d2 = {"Lcom/yandex/mobile/ads/BuildConfigFieldProvider;", "", "()V", "adUrlPath", "", "getAdUrlPath$annotations", "getAdUrlPath", "()Ljava/lang/String;", "buildNumber", "getBuildNumber$annotations", "getBuildNumber", "divKitVersion", "getDivKitVersion$annotations", "getDivKitVersion", "isAutotest", "", "isAutotest$annotations", "()Z", "isDebug", "isDebug$annotations", "isInternalBuild", "isInternalBuild$annotations", "isInternalOrAutotestBuild", "isInternalOrAutotestBuild$annotations", "isMavenBuild", "isMavenBuild$annotations", "isWithLogs", "isWithLogs$annotations", "localUrl", "getLocalUrl$annotations", "getLocalUrl", "mockUrl", "getMockUrl$annotations", "getMockUrl", "prodUrl", "getProdUrl$annotations", "getProdUrl", "version", "getVersion$annotations", "getVersion", "versionName", "getVersionName$annotations", "getVersionName", "mobileads_externalRelease"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes.dex */
public final class BuildConfigFieldProvider {

    @NotNull
    public static final BuildConfigFieldProvider INSTANCE = new BuildConfigFieldProvider();

    private BuildConfigFieldProvider() {
    }

    @NotNull
    public static final String getAdUrlPath() {
        return "v4/ad";
    }

    @JvmStatic
    public static /* synthetic */ void getAdUrlPath$annotations() {
    }

    @NotNull
    public static final String getBuildNumber() {
        return "20665";
    }

    @JvmStatic
    public static /* synthetic */ void getBuildNumber$annotations() {
    }

    @NotNull
    public static final String getDivKitVersion() {
        return "25.2.0";
    }

    @JvmStatic
    public static /* synthetic */ void getDivKitVersion$annotations() {
    }

    @NotNull
    public static final String getLocalUrl() {
        return "";
    }

    @JvmStatic
    public static /* synthetic */ void getLocalUrl$annotations() {
    }

    @NotNull
    public static final String getMockUrl() {
        return "";
    }

    @JvmStatic
    public static /* synthetic */ void getMockUrl$annotations() {
    }

    @NotNull
    public static final String getProdUrl() {
        return "";
    }

    @JvmStatic
    public static /* synthetic */ void getProdUrl$annotations() {
    }

    @NotNull
    public static final String getVersion() {
        return "5.9.0";
    }

    @JvmStatic
    public static /* synthetic */ void getVersion$annotations() {
    }

    @NotNull
    public static final String getVersionName() {
        return "5.9.0";
    }

    @JvmStatic
    public static /* synthetic */ void getVersionName$annotations() {
    }

    public static final boolean isAutotest() {
        return false;
    }

    @JvmStatic
    public static /* synthetic */ void isAutotest$annotations() {
    }

    public static final boolean isDebug() {
        return false;
    }

    @JvmStatic
    public static /* synthetic */ void isDebug$annotations() {
    }

    public static final boolean isInternalBuild() {
        return false;
    }

    @JvmStatic
    public static /* synthetic */ void isInternalBuild$annotations() {
    }

    public static final boolean isInternalOrAutotestBuild() {
        return isInternalBuild() || isAutotest();
    }

    @JvmStatic
    public static /* synthetic */ void isInternalOrAutotestBuild$annotations() {
    }

    public static final boolean isMavenBuild() {
        return true;
    }

    @JvmStatic
    public static /* synthetic */ void isMavenBuild$annotations() {
    }

    public static final boolean isWithLogs() {
        return false;
    }

    @JvmStatic
    public static /* synthetic */ void isWithLogs$annotations() {
    }
}
