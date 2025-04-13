package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.network.api.CommentVotesApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommentVotesRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/CommentVotesRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CommentVotesRepository {

    /* renamed from: a */
    @NotNull
    public CommentVotesApi f27340a;

    /* renamed from: b */
    @NotNull
    public Prefs f27341b;

    public CommentVotesRepository(@NotNull CommentVotesApi commentVotesApi, @NotNull Prefs prefs) {
        this.f27340a = commentVotesApi;
        this.f27341b = prefs;
    }
}
