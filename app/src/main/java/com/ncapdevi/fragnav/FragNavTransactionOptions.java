package com.ncapdevi.fragnav;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: FragNavTransactionOptions.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/ncapdevi/fragnav/FragNavTransactionOptions;", "", "Builder", "Companion", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class FragNavTransactionOptions {

    /* renamed from: a */
    @NotNull
    public final List<Pair<View, String>> f24574a;

    /* compiled from: FragNavTransactionOptions.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/ncapdevi/fragnav/FragNavTransactionOptions$Builder;", "", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Builder {

        /* renamed from: a */
        @NotNull
        public List<Pair<View, String>> f24575a = new ArrayList();
    }

    /* compiled from: FragNavTransactionOptions.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/ncapdevi/fragnav/FragNavTransactionOptions$Companion;", "", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    public FragNavTransactionOptions(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this.f24574a = builder.f24575a;
    }
}
