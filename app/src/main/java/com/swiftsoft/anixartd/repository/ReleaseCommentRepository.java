package com.swiftsoft.anixartd.repository;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.api.ReleaseCommentApi;
import com.swiftsoft.anixartd.network.request.CommentProcessRequest;
import com.swiftsoft.anixartd.network.request.release.comment.ReleaseCommentAddRequest;
import com.swiftsoft.anixartd.network.request.release.comment.ReleaseCommentEditRequest;
import com.swiftsoft.anixartd.network.response.release.comment.ReleaseCommentAddResponse;
import com.swiftsoft.anixartd.network.response.release.comment.ReleaseCommentDeleteResponse;
import com.swiftsoft.anixartd.network.response.release.comment.ReleaseCommentEditResponse;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseCommentRepository.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/repository/ReleaseCommentRepository;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseCommentRepository {

    /* renamed from: a */
    @NotNull
    public ReleaseCommentApi f27380a;

    /* renamed from: b */
    @NotNull
    public Prefs f27381b;

    public ReleaseCommentRepository(@NotNull ReleaseCommentApi releaseCommentApi, @NotNull Prefs prefs) {
        this.f27380a = releaseCommentApi;
        this.f27381b = prefs;
    }

    @NotNull
    /* renamed from: a */
    public final Observable<ReleaseCommentAddResponse> m15308a(long j2, @Nullable Long l2, @Nullable Long l3, @NotNull String message, boolean z) {
        Intrinsics.m32179h(message, "message");
        return this.f27380a.add(j2, new ReleaseCommentAddRequest(l2, l3, message, z), this.f27381b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @NotNull
    /* renamed from: c */
    public final Observable<ReleaseCommentDeleteResponse> m15309c(long j2) {
        return this.f27380a.delete(j2, this.f27381b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @NotNull
    /* renamed from: d */
    public final Observable<ReleaseCommentEditResponse> m15310d(long j2, @NotNull String str, boolean z) {
        return this.f27380a.edit(j2, new ReleaseCommentEditRequest(str, z), this.f27381b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @NotNull
    /* renamed from: e */
    public final Observable<Response> m15311e(long j2, @NotNull String str, @Nullable String str2, @Nullable Long l2, boolean z, boolean z2, boolean z3) {
        return this.f27380a.process(j2, new CommentProcessRequest(str, str2, l2, z, z2, z3), this.f27381b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }

    @NotNull
    /* renamed from: f */
    public final Observable<Response> m15312f(long j2, int i2) {
        return this.f27380a.vote(j2, i2, this.f27381b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
    }
}
