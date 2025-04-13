package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.network.api.RelatedApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: RelatedRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/RelatedRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class RelatedRepository {

    /* renamed from: a */
    @NotNull
    public RelatedApi f27378a;

    /* renamed from: b */
    @NotNull
    public Prefs f27379b;

    public RelatedRepository(@NotNull RelatedApi relatedApi, @NotNull Prefs prefs) {
        this.f27378a = relatedApi;
        this.f27379b = prefs;
    }
}
