package com.swiftsoft.anixartd.p015ui.logic.main.notifications;

import com.swiftsoft.anixartd.database.entity.notification.ProfileFriendNotification;
import com.swiftsoft.anixartd.database.entity.notification.ProfileMyCollectionCommentNotification;
import com.swiftsoft.anixartd.database.entity.notification.ProfileNotification;
import com.swiftsoft.anixartd.database.entity.notification.collection.ProfileCollectionCommentNotification;
import com.swiftsoft.anixartd.database.entity.notification.episode.ProfileEpisodeNotification;
import com.swiftsoft.anixartd.database.entity.notification.related.ProfileRelatedReleaseNotification;
import com.swiftsoft.anixartd.database.entity.notification.release.ProfileReleaseCommentNotification;
import com.swiftsoft.anixartd.p015ui.logic.UiLogic;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: NotificationsUiLogic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/notifications/NotificationsUiLogic;", "Lcom/swiftsoft/anixartd/ui/logic/UiLogic;", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NotificationsUiLogic extends UiLogic {

    /* renamed from: b */
    public int f29119b;

    /* renamed from: d */
    public boolean f29121d;

    /* renamed from: e */
    public boolean f29122e;

    /* renamed from: f */
    public boolean f29123f;

    /* renamed from: g */
    public boolean f29124g;

    /* renamed from: o */
    public boolean f29132o;

    /* renamed from: p */
    public boolean f29133p;

    /* renamed from: c */
    public int f29120c = 1;

    /* renamed from: h */
    @NotNull
    public List<ProfileFriendNotification> f29125h = new ArrayList();

    /* renamed from: i */
    @NotNull
    public List<ProfileEpisodeNotification> f29126i = new ArrayList();

    /* renamed from: j */
    @NotNull
    public List<ProfileReleaseCommentNotification> f29127j = new ArrayList();

    /* renamed from: k */
    @NotNull
    public List<ProfileCollectionCommentNotification> f29128k = new ArrayList();

    /* renamed from: l */
    @NotNull
    public List<ProfileMyCollectionCommentNotification> f29129l = new ArrayList();

    /* renamed from: m */
    @NotNull
    public List<ProfileRelatedReleaseNotification> f29130m = new ArrayList();

    /* renamed from: n */
    @NotNull
    public List<ProfileNotification> f29131n = new ArrayList();

    /* compiled from: NotificationsUiLogic.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/logic/main/notifications/NotificationsUiLogic$Companion;", "", "", "FILTER_ALL_NOTIFICATIONS", "I", "FILTER_ONLY_COMMENT_NOTIFICATIONS", "FILTER_ONLY_EPISODE_NOTIFICATIONS", "FILTER_ONLY_FRIEND_NOTIFICATIONS", "FILTER_ONLY_RELEASE_NOTIFICATIONS", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* renamed from: a */
    public final void m15685a() {
        this.f29119b = 0;
        this.f29125h.clear();
        this.f29126i.clear();
        this.f29127j.clear();
        this.f29128k.clear();
        this.f29129l.clear();
        this.f29130m.clear();
        this.f29131n.clear();
        this.f29133p = false;
    }
}
