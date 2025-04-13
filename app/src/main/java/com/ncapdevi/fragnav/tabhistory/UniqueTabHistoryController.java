package com.ncapdevi.fragnav.tabhistory;

import com.ncapdevi.fragnav.FragNavPopController;
import com.ncapdevi.fragnav.FragNavSwitchController;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UniqueTabHistoryController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/ncapdevi/fragnav/tabhistory/UniqueTabHistoryController;", "Lcom/ncapdevi/fragnav/tabhistory/CollectionFragNavTabHistoryController;", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class UniqueTabHistoryController extends CollectionFragNavTabHistoryController {

    /* renamed from: c */
    public final LinkedHashSet<Integer> f24578c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniqueTabHistoryController(@NotNull FragNavPopController fragNavPopController, @NotNull FragNavSwitchController fragNavSwitchController) {
        super(fragNavPopController, fragNavSwitchController);
        Intrinsics.m32180i(fragNavSwitchController, "fragNavSwitchController");
        this.f24578c = new LinkedHashSet<>();
    }

    @Override // com.ncapdevi.fragnav.tabhistory.CollectionFragNavTabHistoryController
    /* renamed from: a */
    public int mo13836a() {
        ArrayList arrayList = new ArrayList(this.f24578c);
        Object obj = arrayList.get(this.f24578c.size() - 1);
        Intrinsics.m32175d(obj, "tabList[tabHistory.size - 1]");
        int intValue = ((Number) obj).intValue();
        Object obj2 = arrayList.get(this.f24578c.size() - 2);
        Intrinsics.m32175d(obj2, "tabList[tabHistory.size - 2]");
        int intValue2 = ((Number) obj2).intValue();
        this.f24578c.remove(Integer.valueOf(intValue));
        this.f24578c.remove(Integer.valueOf(intValue2));
        return intValue2;
    }

    @Override // com.ncapdevi.fragnav.tabhistory.CollectionFragNavTabHistoryController
    /* renamed from: b */
    public int mo13837b() {
        return this.f24578c.size();
    }

    @Override // com.ncapdevi.fragnav.tabhistory.CollectionFragNavTabHistoryController
    @NotNull
    /* renamed from: c */
    public ArrayList<Integer> mo13838c() {
        return new ArrayList<>(this.f24578c);
    }

    @Override // com.ncapdevi.fragnav.tabhistory.CollectionFragNavTabHistoryController
    /* renamed from: d */
    public void mo13839d(@NotNull ArrayList<Integer> arrayList) {
        this.f24578c.clear();
        this.f24578c.addAll(arrayList);
    }

    @Override // com.ncapdevi.fragnav.tabhistory.FragNavTabHistoryController
    /* renamed from: t0 */
    public void mo13843t0(int i2) {
        this.f24578c.remove(Integer.valueOf(i2));
        this.f24578c.add(Integer.valueOf(i2));
    }
}
