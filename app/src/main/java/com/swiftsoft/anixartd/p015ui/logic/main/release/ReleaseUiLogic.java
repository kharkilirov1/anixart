package com.swiftsoft.anixartd.p015ui.logic.main.release;

import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoBanner;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReleaseUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/release/ReleaseUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseUiLogic extends UiLogic {

    /* renamed from: b */
    public long f29288b;

    /* renamed from: c */
    public Release f29289c;

    /* renamed from: g */
    public int f29293g;

    /* renamed from: h */
    public boolean f29294h;

    /* renamed from: i */
    public int f29295i;

    /* renamed from: j */
    public long f29296j;

    /* renamed from: k */
    public int f29297k;

    /* renamed from: l */
    public long f29298l;

    /* renamed from: m */
    public boolean f29299m;

    /* renamed from: s */
    public boolean f29305s;

    /* renamed from: t */
    public boolean f29306t;

    /* renamed from: u */
    public boolean f29307u;

    /* renamed from: v */
    public boolean f29308v;

    /* renamed from: w */
    public boolean f29309w;

    /* renamed from: x */
    public boolean f29310x;

    /* renamed from: d */
    @NotNull
    public String[] f29290d = new String[0];

    /* renamed from: e */
    @NotNull
    public String[] f29291e = new String[0];

    /* renamed from: f */
    @NotNull
    public Set<Long> f29292f = new LinkedHashSet();

    /* renamed from: n */
    @NotNull
    public List<ReleaseVideoBanner> f29300n = new ArrayList();

    /* renamed from: o */
    @NotNull
    public List<String> f29301o = new ArrayList();

    /* renamed from: p */
    @NotNull
    public List<Release> f29302p = new ArrayList();

    /* renamed from: q */
    @NotNull
    public List<Release> f29303q = new ArrayList();

    /* renamed from: r */
    @NotNull
    public List<ReleaseComment> f29304r = new ArrayList();

    @NotNull
    /* renamed from: a */
    public final Release m15701a() {
        Release release = this.f29289c;
        if (release != null) {
            return release;
        }
        Intrinsics.m32189r("release");
        throw null;
    }

    /* renamed from: b */
    public final boolean m15702b() {
        return this.f29289c != null;
    }

    /* renamed from: c */
    public final boolean m15703c(@NotNull ReleaseComment releaseComment) {
        Intrinsics.m32179h(releaseComment, "releaseComment");
        Iterator<ReleaseComment> it = this.f29304r.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().getId() == releaseComment.getId()) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            m15701a().setCommentCount(r10.getCommentCount() - 1);
            this.f29304r.remove(i2);
        }
        return i2 >= 0;
    }
}
