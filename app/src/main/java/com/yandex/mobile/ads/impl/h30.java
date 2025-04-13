package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.parser.offset.C6271a;
import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h30 {

    /* renamed from: b */
    private static final HashSet f50804b = new HashSet(Arrays.asList(f61.f50130c, f61.f50131d, f61.f50129b, f61.f50128a, f61.f50132e));

    /* renamed from: c */
    private static final Map<VastTimeOffset.EnumC6270b, InstreamAdBreakPosition.Type> f50805c = new C5161a();

    /* renamed from: a */
    @NonNull
    private final C6271a f50806a = new C6271a(f50804b);

    /* renamed from: com.yandex.mobile.ads.impl.h30$a */
    public class C5161a extends HashMap<VastTimeOffset.EnumC6270b, InstreamAdBreakPosition.Type> {
        public C5161a() {
            put(VastTimeOffset.EnumC6270b.f57986a, InstreamAdBreakPosition.Type.MILLISECONDS);
            put(VastTimeOffset.EnumC6270b.f57987b, InstreamAdBreakPosition.Type.PERCENTS);
            put(VastTimeOffset.EnumC6270b.f57988c, InstreamAdBreakPosition.Type.POSITION);
        }
    }

    @Nullable
    /* renamed from: a */
    public final InstreamAdBreakPosition m25039a(@NonNull e61 e61Var) {
        VastTimeOffset m30767a = this.f50806a.m30767a(e61Var.m24038a());
        if (m30767a != null) {
            InstreamAdBreakPosition.Type type = (InstreamAdBreakPosition.Type) ((HashMap) f50805c).get(m30767a.m30765c());
            if (type != null) {
                return new InstreamAdBreakPosition(type, (long) m30767a.m30766d());
            }
        }
        return null;
    }
}
