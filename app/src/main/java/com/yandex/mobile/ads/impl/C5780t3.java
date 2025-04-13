package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.t3 */
/* loaded from: classes3.dex */
public final class C5780t3 {

    /* renamed from: b */
    @NonNull
    private static final Map<EnumC5668r3, String> f54934b = new a();

    /* renamed from: a */
    @NonNull
    private final C5724s3 f54935a;

    /* renamed from: com.yandex.mobile.ads.impl.t3$a */
    public class a extends HashMap<EnumC5668r3, String> {
        public a() {
            put(EnumC5668r3.f54170c, "ad_loading_duration");
            put(EnumC5668r3.f54174g, "identifiers_loading_duration");
            put(EnumC5668r3.f54169b, "advertising_info_loading_duration");
            put(EnumC5668r3.f54172e, "autograb_loading_duration");
            put(EnumC5668r3.f54173f, "bidding_data_loading_duration");
            put(EnumC5668r3.f54177j, "network_request_durations");
            put(EnumC5668r3.f54175h, "image_loading_duration");
            put(EnumC5668r3.f54176i, "video_caching_duration");
            put(EnumC5668r3.f54168a, "adapter_loading_duration");
            put(EnumC5668r3.f54178k, "vast_loading_durations");
            put(EnumC5668r3.f54181n, "vmap_loading_duration");
        }
    }

    public C5780t3(@NonNull C5724s3 c5724s3) {
        this.f54935a = c5724s3;
    }

    @NonNull
    /* renamed from: a */
    public final HashMap m28439a() {
        HashMap hashMap = new HashMap();
        for (C5617q3 c5617q3 : this.f54935a.m28054b()) {
            String str = (String) ((HashMap) f54934b).get(c5617q3.m27608a());
            if (str != null) {
                List list = (List) hashMap.get(str);
                if (list != null) {
                    list.add(c5617q3.m27609b());
                } else {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(c5617q3.m27609b());
                    hashMap.put(str, linkedList);
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("durations", hashMap);
        return hashMap2;
    }

    @NonNull
    /* renamed from: b */
    public final Map<String, Object> m28440b() {
        tv0 tv0Var = new tv0(new HashMap());
        for (C5617q3 c5617q3 : this.f54935a.m28054b()) {
            if (c5617q3.m27608a().ordinal() == 3) {
                tv0Var.m28761b(c5617q3.m27609b(), "ad_rendering_duration");
            }
        }
        return tv0Var.m28756a();
    }
}
