package com.p017vk.api.sdk.utils.log;

import android.util.Log;
import com.p017vk.api.sdk.utils.log.Logger;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DefaultApiLogger.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/utils/log/DefaultApiLogger;", "Lcom/vk/api/sdk/utils/log/Logger;", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public class DefaultApiLogger implements Logger {

    /* renamed from: a */
    @NotNull
    public Lazy<? extends Logger.LogLevel> f30798a;

    /* renamed from: b */
    @NotNull
    public final String f30799b;

    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 16})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Logger.LogLevel.values().length];
            iArr[4] = 1;
            iArr[0] = 2;
            iArr[1] = 3;
            iArr[2] = 4;
            iArr[3] = 5;
        }
    }

    public DefaultApiLogger(@NotNull Lazy<? extends Logger.LogLevel> lazy, @NotNull String str) {
        this.f30798a = lazy;
        this.f30799b = str;
    }

    @Override // com.p017vk.api.sdk.utils.log.Logger
    @NotNull
    /* renamed from: a */
    public Lazy<Logger.LogLevel> mo16539a() {
        return this.f30798a;
    }

    @Override // com.p017vk.api.sdk.utils.log.Logger
    /* renamed from: b */
    public void mo16540b(@NotNull Logger.LogLevel level, @Nullable String str, @Nullable Throwable th) {
        Intrinsics.m32180i(level, "level");
        if (this.f30798a.getValue().ordinal() > level.ordinal()) {
            return;
        }
        int ordinal = level.ordinal();
        if (ordinal == 0) {
            Log.v(this.f30799b, str, th);
            return;
        }
        if (ordinal == 1) {
            Log.d(this.f30799b, str, th);
        } else if (ordinal == 2) {
            Log.w(this.f30799b, str, th);
        } else {
            if (ordinal != 3) {
                return;
            }
            Log.e(this.f30799b, str, th);
        }
    }
}
