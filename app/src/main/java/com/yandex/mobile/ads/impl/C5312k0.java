package com.yandex.mobile.ads.impl;

import android.content.pm.ActivityInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div2.C3033a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.k0 */
/* loaded from: classes3.dex */
public final class C5312k0 {

    /* renamed from: a */
    @Deprecated
    @NotNull
    private static final Map<Integer, String> f51795a = MapsKt.m32064i(new Pair(16, "ActivityInfo.CONFIG_KEYBOARD"), new Pair(32, "ActivityInfo.CONFIG_KEYBOARD_HIDDEN"), new Pair(128, "ActivityInfo.CONFIG_ORIENTATION"), new Pair(256, "ActivityInfo.CONFIG_SCREEN_LAYOUT"), new Pair(Integer.valueOf(RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN), "ActivityInfo.CONFIG_UI_MODE"), new Pair(Integer.valueOf(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE), "ActivityInfo.CONFIG_SCREEN_SIZE"), new Pair(Integer.valueOf(RecyclerView.ViewHolder.FLAG_MOVED), "CONFIG_SMALLEST_SCREEN_SIZE"));

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m26000a(@NotNull ActivityInfo adActivity) {
        String str;
        Intrinsics.m32179h(adActivity, "adActivity");
        Map<Integer, String> map = f51795a;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Integer, String> next = it.next();
            int intValue = next.getKey().intValue();
            String value = next.getValue();
            if ((intValue & adActivity.configChanges) == 0) {
                str = value;
            }
            arrayList.add(str);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((String) next2) != null) {
                str = next2;
                break;
            }
        }
        String str2 = str;
        if (str2 != null) {
            throw new d60(C3033a.m17745g(new Object[]{str2}, 1, "com.yandex.mobile.ads.common.AdActivity has missed configuration attribute %s.", "format(this, *args)"));
        }
    }
}
