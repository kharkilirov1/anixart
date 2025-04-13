package com.ncapdevi.fragnav.tabhistory;

import java.util.ArrayList;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: UnlimitedTabHistoryController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/ncapdevi/fragnav/tabhistory/UnlimitedTabHistoryController;", "Lcom/ncapdevi/fragnav/tabhistory/CollectionFragNavTabHistoryController;", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class UnlimitedTabHistoryController extends CollectionFragNavTabHistoryController {

    /* renamed from: c */
    public final Stack<Integer> f24580c;

    @Override // com.ncapdevi.fragnav.tabhistory.CollectionFragNavTabHistoryController
    /* renamed from: a */
    public int mo13836a() {
        this.f24580c.pop();
        Integer pop = this.f24580c.pop();
        Intrinsics.m32175d(pop, "tabHistory.pop()");
        return pop.intValue();
    }

    @Override // com.ncapdevi.fragnav.tabhistory.CollectionFragNavTabHistoryController
    /* renamed from: b */
    public int mo13837b() {
        return this.f24580c.size();
    }

    @Override // com.ncapdevi.fragnav.tabhistory.CollectionFragNavTabHistoryController
    @NotNull
    /* renamed from: c */
    public ArrayList<Integer> mo13838c() {
        return new ArrayList<>(this.f24580c);
    }

    @Override // com.ncapdevi.fragnav.tabhistory.CollectionFragNavTabHistoryController
    /* renamed from: d */
    public void mo13839d(@NotNull ArrayList<Integer> arrayList) {
        this.f24580c.clear();
        this.f24580c.addAll(arrayList);
    }

    @Override // com.ncapdevi.fragnav.tabhistory.FragNavTabHistoryController
    /* renamed from: t0 */
    public void mo13843t0(int i2) {
        this.f24580c.push(Integer.valueOf(i2));
    }
}
