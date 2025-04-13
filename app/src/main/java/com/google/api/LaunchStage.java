package com.google.api;

import com.google.protobuf.Internal;

/* loaded from: classes.dex */
public enum LaunchStage implements Internal.EnumLite {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);


    /* renamed from: b */
    public final int f20395b;

    /* renamed from: com.google.api.LaunchStage$1 */
    public class C15151 implements Internal.EnumLiteMap<LaunchStage> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public LaunchStage mo11029a(int i2) {
            return LaunchStage.m11057a(i2);
        }
    }

    public static final class LaunchStageVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        /* renamed from: a */
        public boolean mo11030a(int i2) {
            return LaunchStage.m11057a(i2) != null;
        }
    }

    LaunchStage(int i2) {
        this.f20395b = i2;
    }

    /* renamed from: a */
    public static LaunchStage m11057a(int i2) {
        if (i2 == 0) {
            return LAUNCH_STAGE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return EARLY_ACCESS;
        }
        if (i2 == 2) {
            return ALPHA;
        }
        if (i2 == 3) {
            return BETA;
        }
        if (i2 == 4) {
            return GA;
        }
        if (i2 != 5) {
            return null;
        }
        return DEPRECATED;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    /* renamed from: x */
    public final int mo11028x() {
        if (this != UNRECOGNIZED) {
            return this.f20395b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
