package com.swiftsoft.anixartd.p015ui.logic.main.search;

import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.Related;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.Search;
import com.swiftsoft.anixartd.network.request.SearchRequest;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SearchUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/search/SearchUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SearchUiLogic extends UiLogic {

    /* renamed from: b */
    public int f29341b;

    /* renamed from: e */
    @Nullable
    public Long f29344e;

    /* renamed from: f */
    @Nullable
    public Long f29345f;

    /* renamed from: i */
    public int f29348i;

    /* renamed from: o */
    @Nullable
    public Related f29354o;

    /* renamed from: p */
    public boolean f29355p;

    /* renamed from: q */
    public boolean f29356q;

    /* renamed from: r */
    public boolean f29357r;

    /* renamed from: s */
    public boolean f29358s;

    /* renamed from: t */
    public boolean f29359t;

    /* renamed from: c */
    @NotNull
    public String f29342c = "TAB_HOME";

    /* renamed from: d */
    @NotNull
    public String f29343d = "INNER_TAB_NONE";

    /* renamed from: g */
    @NotNull
    public String f29346g = "";

    /* renamed from: h */
    @NotNull
    public String f29347h = "";

    /* renamed from: j */
    @NotNull
    public String f29349j = "";

    /* renamed from: k */
    @NotNull
    public List<Search> f29350k = new ArrayList();

    /* renamed from: l */
    @NotNull
    public List<Release> f29351l = new ArrayList();

    /* renamed from: m */
    @NotNull
    public List<Collection> f29352m = new ArrayList();

    /* renamed from: n */
    @NotNull
    public List<Profile> f29353n = new ArrayList();

    /* compiled from: SearchUiLogic.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/search/SearchUiLogic$Companion;", "", "", "ACTION_COLLECTIONS", "Ljava/lang/String;", "ACTION_PROFILES", "ACTION_RELEASES", "ACTION_SEARCHES", "SEARCH_EMPTY", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* renamed from: a */
    public final void m15705a() {
        this.f29348i = 0;
        this.f29349j = "";
        this.f29350k.clear();
        this.f29351l.clear();
        this.f29352m.clear();
        this.f29353n.clear();
        this.f29354o = null;
        this.f29355p = false;
        this.f29356q = false;
        this.f29358s = false;
        this.f29359t = false;
    }

    /* renamed from: b */
    public final void m15706b(@NotNull List<Release> releases) {
        Intrinsics.m32179h(releases, "releases");
        this.f29349j = "ACTION_RELEASES";
        if (this.f29356q) {
            this.f29351l.addAll(releases);
            return;
        }
        if (this.f29356q) {
            m15705a();
        }
        this.f29351l.addAll(releases);
        this.f29356q = true;
    }

    @NotNull
    /* renamed from: c */
    public final SearchRequest m15707c() {
        return new SearchRequest(this.f29346g, this.f29341b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        if (r0.equals("INNER_TAB_BOOKMARKS_COLLECTIONS") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
    
        return com.swiftsoft.anixartd.database.entity.Search.TYPE_COLLECTION;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r0.equals("TAB_COLLECTIONS_PROFILE") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        if (r0.equals("SECTION_MY_COLLECTIONS") != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b8, code lost:
    
        if (r0.equals("SECTION_COLLECTIONS") != false) goto L53;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m15708d() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f29342c
            int r1 = r0.hashCode()
            java.lang.String r2 = "TYPE_RELEASE"
            java.lang.String r3 = "TYPE_COLLECTION"
            switch(r1) {
                case -1836047621: goto Lb2;
                case -1818334861: goto La9;
                case -1069630785: goto L9e;
                case -943792100: goto L95;
                case -95141015: goto L8c;
                case -51137291: goto L83;
                case 1624588691: goto Lf;
                default: goto Ld;
            }
        Ld:
            goto Lbc
        Lf:
            java.lang.String r1 = "TAB_BOOKMARKS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbc
            java.lang.String r0 = r4.f29343d
            int r1 = r0.hashCode()
            switch(r1) {
                case -2109617152: goto L65;
                case -2012826750: goto L5c;
                case -1817489912: goto L53;
                case -1630519434: goto L49;
                case -119111553: goto L3f;
                case 45737322: goto L35;
                case 879690667: goto L2b;
                case 2121300245: goto L21;
                default: goto L20;
            }
        L20:
            goto L6e
        L21:
            java.lang.String r1 = "INNER_TAB_BOOKMARKS_PLANS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6e
            goto Lbb
        L2b:
            java.lang.String r1 = "INNER_TAB_BOOKMARKS_DROPPED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6e
            goto Lbb
        L35:
            java.lang.String r1 = "INNER_TAB_BOOKMARKS_HOLD_ON"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6e
            goto Lbb
        L3f:
            java.lang.String r1 = "INNER_TAB_BOOKMARKS_HISTORY"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6e
            goto Lbb
        L49:
            java.lang.String r1 = "INNER_TAB_BOOKMARKS_COMPLETED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6e
            goto Lbb
        L53:
            java.lang.String r1 = "INNER_TAB_BOOKMARKS_WATCHING"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6e
            goto Lbb
        L5c:
            java.lang.String r1 = "INNER_TAB_BOOKMARKS_FAVORITES"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6e
            goto Lbb
        L65:
            java.lang.String r1 = "INNER_TAB_BOOKMARKS_COLLECTIONS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6e
            goto Lba
        L6e:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Invalid inner tab: "
            java.lang.StringBuilder r1 = p000a.C0000a.m24u(r1)
            java.lang.String r2 = r4.f29343d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L83:
            java.lang.String r1 = "TAB_COLLECTIONS_PROFILE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbc
            goto Lba
        L8c:
            java.lang.String r1 = "TAB_HOME"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbc
            goto Lbb
        L95:
            java.lang.String r1 = "SECTION_MY_COLLECTIONS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbc
            goto Lba
        L9e:
            java.lang.String r1 = "TAB_PROFILE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbc
            java.lang.String r2 = "TYPE_PROFILE"
            goto Lbb
        La9:
            java.lang.String r1 = "TAB_DISCOVER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbc
            goto Lbb
        Lb2:
            java.lang.String r1 = "SECTION_COLLECTIONS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbc
        Lba:
            r2 = r3
        Lbb:
            return r2
        Lbc:
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Invalid tab: "
            java.lang.StringBuilder r1 = p000a.C0000a.m24u(r1)
            java.lang.String r2 = r4.f29342c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.p015ui.logic.main.search.SearchUiLogic.m15708d():java.lang.String");
    }

    /* renamed from: e */
    public final void m15709e(@NotNull String str) {
        Intrinsics.m32179h(str, "<set-?>");
        this.f29347h = str;
    }

    /* renamed from: f */
    public final void m15710f(@NotNull String str) {
        this.f29346g = str;
    }
}
