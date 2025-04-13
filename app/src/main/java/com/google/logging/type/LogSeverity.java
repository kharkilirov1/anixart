package com.google.logging.type;

import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum LogSeverity implements Internal.EnumLite {
    DEFAULT(0),
    DEBUG(100),
    INFO(DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER),
    NOTICE(300),
    WARNING(400),
    ERROR(500),
    CRITICAL(600),
    ALERT(700),
    EMERGENCY(800),
    UNRECOGNIZED(-1);


    /* renamed from: b */
    public final int f23940b;

    /* renamed from: com.google.logging.type.LogSeverity$1 */
    public class C23301 implements Internal.EnumLiteMap<LogSeverity> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public LogSeverity mo11029a(int i2) {
            return LogSeverity.m12965a(i2);
        }
    }

    public static final class LogSeverityVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        /* renamed from: a */
        public boolean mo11030a(int i2) {
            return LogSeverity.m12965a(i2) != null;
        }
    }

    LogSeverity(int i2) {
        this.f23940b = i2;
    }

    /* renamed from: a */
    public static LogSeverity m12965a(int i2) {
        if (i2 == 0) {
            return DEFAULT;
        }
        if (i2 == 100) {
            return DEBUG;
        }
        if (i2 == 200) {
            return INFO;
        }
        if (i2 == 300) {
            return NOTICE;
        }
        if (i2 == 400) {
            return WARNING;
        }
        if (i2 == 500) {
            return ERROR;
        }
        if (i2 == 600) {
            return CRITICAL;
        }
        if (i2 == 700) {
            return ALERT;
        }
        if (i2 != 800) {
            return null;
        }
        return EMERGENCY;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    /* renamed from: x */
    public final int mo11028x() {
        if (this != UNRECOGNIZED) {
            return this.f23940b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
