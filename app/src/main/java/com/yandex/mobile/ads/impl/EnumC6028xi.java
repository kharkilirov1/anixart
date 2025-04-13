package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.xi */
/* loaded from: classes3.dex */
public enum EnumC6028xi {
    /* JADX INFO: Fake field, exist only in values array */
    EF9("IABConsent_ConsentString", "IABTCF_TCString"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("IABConsent_SubjectToGDPR", "IABTCF_gdprApplies"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("IABConsent_CMPPresent", "IABTCF_CmpSdkID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("IABConsent_ParsedPurposeConsents", "IABTCF_PurposeConsents"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57("IABConsent_ParsedVendorConsents", "IABTCF_VendorConsents");


    /* renamed from: a */
    @NotNull
    private final String f56476a;

    /* renamed from: b */
    @NotNull
    private final String f56477b;

    /* renamed from: com.yandex.mobile.ads.impl.xi$a */
    public static final class a {
        @Nullable
        /* renamed from: a */
        public static EnumC6028xi m29755a(@NotNull String v1) {
            Intrinsics.m32179h(v1, "v1");
            for (EnumC6028xi enumC6028xi : EnumC6028xi.values()) {
                if (Intrinsics.m32174c(enumC6028xi.m29753a(), v1)) {
                    return enumC6028xi;
                }
            }
            return null;
        }

        @Nullable
        /* renamed from: b */
        public static EnumC6028xi m29756b(@NotNull String v2) {
            Intrinsics.m32179h(v2, "v2");
            for (EnumC6028xi enumC6028xi : EnumC6028xi.values()) {
                if (Intrinsics.m32174c(enumC6028xi.m29754b(), v2)) {
                    return enumC6028xi;
                }
            }
            return null;
        }
    }

    EnumC6028xi(String str, String str2) {
        this.f56476a = str;
        this.f56477b = str2;
    }

    @NotNull
    /* renamed from: a */
    public final String m29753a() {
        return this.f56476a;
    }

    @NotNull
    /* renamed from: b */
    public final String m29754b() {
        return this.f56477b;
    }
}
