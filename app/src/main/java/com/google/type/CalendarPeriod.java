package com.google.type;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum CalendarPeriod implements Internal.EnumLite {
    CALENDAR_PERIOD_UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    FORTNIGHT(3),
    MONTH(4),
    QUARTER(5),
    HALF(6),
    YEAR(7),
    UNRECOGNIZED(-1);


    /* renamed from: b */
    public final int f24490b;

    /* renamed from: com.google.type.CalendarPeriod$1 */
    public class C24311 implements Internal.EnumLiteMap<CalendarPeriod> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public CalendarPeriod mo11029a(int i2) {
            return CalendarPeriod.m13780a(i2);
        }
    }

    public static final class CalendarPeriodVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        /* renamed from: a */
        public boolean mo11030a(int i2) {
            return CalendarPeriod.m13780a(i2) != null;
        }
    }

    CalendarPeriod(int i2) {
        this.f24490b = i2;
    }

    /* renamed from: a */
    public static CalendarPeriod m13780a(int i2) {
        switch (i2) {
            case 0:
                return CALENDAR_PERIOD_UNSPECIFIED;
            case 1:
                return DAY;
            case 2:
                return WEEK;
            case 3:
                return FORTNIGHT;
            case 4:
                return MONTH;
            case 5:
                return QUARTER;
            case 6:
                return HALF;
            case 7:
                return YEAR;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.Internal.EnumLite
    /* renamed from: x */
    public final int mo11028x() {
        if (this != UNRECOGNIZED) {
            return this.f24490b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
