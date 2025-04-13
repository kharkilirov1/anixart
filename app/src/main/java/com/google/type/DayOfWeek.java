package com.google.type;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum DayOfWeek implements Internal.EnumLite {
    DAY_OF_WEEK_UNSPECIFIED(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    UNRECOGNIZED(-1);


    /* renamed from: b */
    public final int f24505b;

    /* renamed from: com.google.type.DayOfWeek$1 */
    public class C24351 implements Internal.EnumLiteMap<DayOfWeek> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public DayOfWeek mo11029a(int i2) {
            return DayOfWeek.m13784a(i2);
        }
    }

    public static final class DayOfWeekVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        /* renamed from: a */
        public boolean mo11030a(int i2) {
            return DayOfWeek.m13784a(i2) != null;
        }
    }

    DayOfWeek(int i2) {
        this.f24505b = i2;
    }

    /* renamed from: a */
    public static DayOfWeek m13784a(int i2) {
        switch (i2) {
            case 0:
                return DAY_OF_WEEK_UNSPECIFIED;
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.Internal.EnumLite
    /* renamed from: x */
    public final int mo11028x() {
        if (this != UNRECOGNIZED) {
            return this.f24505b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
