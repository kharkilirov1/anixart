package com.swiftsoft.anixartd.p015ui.logic.main.bookmarks;

import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BookmarksTabUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/bookmarks/BookmarksTabUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BookmarksTabUiLogic extends UiLogic {

    /* renamed from: c */
    public int f28965c;

    /* renamed from: d */
    public long f28966d;

    /* renamed from: h */
    public boolean f28970h;

    /* renamed from: i */
    public boolean f28971i;

    /* renamed from: j */
    public boolean f28972j;

    /* renamed from: b */
    @NotNull
    public String f28964b = "INNER_TAB_BOOKMARKS_FAVORITES";

    /* renamed from: e */
    public int f28967e = 1;

    /* renamed from: f */
    @NotNull
    public List<Release> f28968f = new ArrayList();

    /* renamed from: g */
    @NotNull
    public List<Collection> f28969g = new ArrayList();

    /* compiled from: BookmarksTabUiLogic.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/bookmarks/BookmarksTabUiLogic$Companion;", "", "", "SORT_PROFILE_LIST_DATE_ASC", "I", "SORT_PROFILE_LIST_DATE_DESC", "SORT_RELEASE_DATE_ASC", "SORT_RELEASE_DATE_DESC", "SORT_TITLE_ASC", "SORT_TITLE_DESC", "STATUS_COMPLETED", "STATUS_DROPPED", "STATUS_HOLD_ON", "STATUS_NOT_WATCHING", "STATUS_PLANS", "STATUS_WATCHING", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* renamed from: a */
    public final void m15664a() {
        this.f28965c = 0;
        this.f28968f.clear();
        this.f28969g.clear();
        this.f28970h = false;
        this.f28971i = false;
    }

    /* renamed from: b */
    public final void m15665b(@NotNull Release release) {
        Iterator<Release> it = this.f28968f.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else {
                if (it.next().getId() == release.getId()) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        if (i2 < 0) {
            this.f28968f.add(0, release);
        } else {
            this.f28968f.set(i2, release);
        }
    }

    /* renamed from: c */
    public final void m15666c(@NotNull List<Release> releases) {
        Intrinsics.m32179h(releases, "releases");
        if (this.f28970h) {
            this.f28968f.addAll(releases);
            return;
        }
        if (this.f28970h) {
            m15664a();
        }
        this.f28968f.addAll(releases);
        this.f28970h = true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: d */
    public final int m15667d() {
        String str = this.f28964b;
        switch (str.hashCode()) {
            case -1817489912:
                if (str.equals("INNER_TAB_BOOKMARKS_WATCHING")) {
                    return 1;
                }
                break;
            case -1630519434:
                if (str.equals("INNER_TAB_BOOKMARKS_COMPLETED")) {
                    return 3;
                }
                break;
            case 45737322:
                if (str.equals("INNER_TAB_BOOKMARKS_HOLD_ON")) {
                    return 4;
                }
                break;
            case 879690667:
                if (str.equals("INNER_TAB_BOOKMARKS_DROPPED")) {
                    return 5;
                }
                break;
            case 2121300245:
                if (str.equals("INNER_TAB_BOOKMARKS_PLANS")) {
                    return 2;
                }
                break;
        }
        throw new Exception("Invalid inner position");
    }
}
