package io.grpc.okhttp;

import com.google.common.base.Preconditions;
import io.grpc.okhttp.internal.framed.ErrorCode;
import io.grpc.okhttp.internal.framed.Settings;
import java.util.EnumMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Buffer;
import okio.ByteString;

/* loaded from: classes3.dex */
class OkHttpFrameLogger {

    /* renamed from: a */
    public final Logger f59290a;

    /* renamed from: b */
    public final Level f59291b;

    public enum Direction {
        INBOUND,
        OUTBOUND
    }

    public enum SettingParams {
        /* JADX INFO: Fake field, exist only in values array */
        HEADER_TABLE_SIZE(1),
        /* JADX INFO: Fake field, exist only in values array */
        ENABLE_PUSH(2),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_CONCURRENT_STREAMS(4),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_FRAME_SIZE(5),
        /* JADX INFO: Fake field, exist only in values array */
        MAX_HEADER_LIST_SIZE(6),
        /* JADX INFO: Fake field, exist only in values array */
        INITIAL_WINDOW_SIZE(7);


        /* renamed from: b */
        public final int f59296b;

        SettingParams(int i2) {
            this.f59296b = i2;
        }
    }

    public OkHttpFrameLogger(Level level, Class<?> cls) {
        Logger logger = Logger.getLogger(cls.getName());
        Preconditions.m11187k(level, "level");
        this.f59291b = level;
        Preconditions.m11187k(logger, "logger");
        this.f59290a = logger;
    }

    /* renamed from: h */
    public static String m31250h(Buffer buffer) {
        long j2 = buffer.f68742c;
        if (j2 <= 64) {
            return buffer.m34558p().mo34577e();
        }
        return buffer.m34560q((int) Math.min(j2, 64L)).mo34577e() + "...";
    }

    /* renamed from: a */
    public final boolean m31251a() {
        return this.f59290a.isLoggable(this.f59291b);
    }

    /* renamed from: b */
    public void m31252b(Direction direction, int i2, Buffer buffer, int i3, boolean z) {
        if (m31251a()) {
            this.f59290a.log(this.f59291b, direction + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + m31250h(buffer));
        }
    }

    /* renamed from: c */
    public void m31253c(Direction direction, int i2, ErrorCode errorCode, ByteString byteString) {
        if (m31251a()) {
            Logger logger = this.f59290a;
            Level level = this.f59291b;
            StringBuilder sb = new StringBuilder();
            sb.append(direction);
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i2);
            sb.append(" errorCode=");
            sb.append(errorCode);
            sb.append(" length=");
            sb.append(byteString.mo34576d());
            sb.append(" bytes=");
            Buffer buffer = new Buffer();
            buffer.m34566v(byteString);
            sb.append(m31250h(buffer));
            logger.log(level, sb.toString());
        }
    }

    /* renamed from: d */
    public void m31254d(Direction direction, long j2) {
        if (m31251a()) {
            this.f59290a.log(this.f59291b, direction + " PING: ack=false bytes=" + j2);
        }
    }

    /* renamed from: e */
    public void m31255e(Direction direction, int i2, ErrorCode errorCode) {
        if (m31251a()) {
            this.f59290a.log(this.f59291b, direction + " RST_STREAM: streamId=" + i2 + " errorCode=" + errorCode);
        }
    }

    /* renamed from: f */
    public void m31256f(Direction direction, Settings settings) {
        if (m31251a()) {
            Logger logger = this.f59290a;
            Level level = this.f59291b;
            StringBuilder sb = new StringBuilder();
            sb.append(direction);
            sb.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(SettingParams.class);
            for (SettingParams settingParams : SettingParams.values()) {
                if (settings.m31320a(settingParams.f59296b)) {
                    enumMap.put((EnumMap) settingParams, (SettingParams) Integer.valueOf(settings.f59481d[settingParams.f59296b]));
                }
            }
            sb.append(enumMap.toString());
            logger.log(level, sb.toString());
        }
    }

    /* renamed from: g */
    public void m31257g(Direction direction, int i2, long j2) {
        if (m31251a()) {
            this.f59290a.log(this.f59291b, direction + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j2);
        }
    }
}
