package com.p017vk.api.sdk.utils.log;

import kotlin.Lazy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Logger.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/utils/log/Logger;", "", "LogLevel", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public interface Logger {

    /* compiled from: Logger.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 16})
    public static final class DefaultImpls {
    }

    /* compiled from: Logger.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31884d2 = {"Lcom/vk/api/sdk/utils/log/Logger$LogLevel;", "", "VERBOSE", "DEBUG", "WARNING", "ERROR", "NONE", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public enum LogLevel {
        VERBOSE,
        DEBUG,
        WARNING,
        ERROR,
        NONE
    }

    @NotNull
    /* renamed from: a */
    Lazy<LogLevel> mo16539a();

    /* renamed from: b */
    void mo16540b(@NotNull LogLevel logLevel, @Nullable String str, @Nullable Throwable th);
}
