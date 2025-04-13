package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.rr */
/* loaded from: classes3.dex */
public enum EnumC5708rr {
    f54401b("NO_ERROR"),
    f54402c("PROTOCOL_ERROR"),
    f54403d("INTERNAL_ERROR"),
    f54404e("FLOW_CONTROL_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("SETTINGS_TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10("STREAM_CLOSED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("FRAME_SIZE_ERROR"),
    f54405f("REFUSED_STREAM"),
    f54406g("CANCEL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF91("COMPRESSION_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF100("CONNECT_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF109("ENHANCE_YOUR_CALM"),
    /* JADX INFO: Fake field, exist only in values array */
    EF118("INADEQUATE_SECURITY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF127("HTTP_1_1_REQUIRED");


    /* renamed from: a */
    private final int f54408a;

    /* renamed from: com.yandex.mobile.ads.impl.rr$a */
    public static final class a {
        @Nullable
        /* renamed from: a */
        public static EnumC5708rr m27979a(int i2) {
            for (EnumC5708rr enumC5708rr : EnumC5708rr.values()) {
                if (enumC5708rr.m27978a() == i2) {
                    return enumC5708rr;
                }
            }
            return null;
        }
    }

    EnumC5708rr(String str) {
        this.f54408a = r2;
    }

    /* renamed from: a */
    public final int m27978a() {
        return this.f54408a;
    }
}
