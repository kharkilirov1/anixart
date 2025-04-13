package androidx.core.view.inputmethod;

import android.app.Dialog;
import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputContentInfo;
import androidx.activity.result.ActivityResultCallback;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.trackselection.TrackSelectionUtil;
import com.google.android.exoplayer2.video.VideoFrameReleaseHelper;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.episode.Type;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.common.TypeResponse;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.dialog.BookmarksImportFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.TabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionCommentsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionCommentsRepliesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionListFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionProfileListFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.comments.CommentVotesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.episodes.updates.EpisodesUpdatesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.home.CustomFilterTabFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.notifications.NotificationsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileBlockListFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileChangeLoginHistoryFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.friends.ProfileFriendRequestsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.friends.ProfileFriendsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.friends.ProfileOutFriendRequestsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.videos.ProfileReleaseVideoAppealsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.videos.ProfileReleaseVideosAllFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.vote.ProfileReleaseUnvotedFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.vote.ProfileReleaseVoteFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.preference.ProfileReleaseTypeNotificationPreferenceUiLogic;
import com.swiftsoft.anixartd.presentation.main.preference.ProfileReleaseNotificationPreferencesPresenter;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.core.view.inputmethod.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0273a implements InputConnectionCompat.OnCommitContentListener, SynchronizationGuard.CriticalSection, BinarySearchSeeker.SeekTimestampConverter, DrmSessionManagerProvider, TrackSelectionUtil.AdaptiveTrackSelectionFactory, VideoFrameReleaseHelper.DisplayHelper.Listener, AccessibilityViewCommand, Consumer, ActivityResultCallback, SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: b */
    public final /* synthetic */ int f3784b;

    /* renamed from: c */
    public final /* synthetic */ Object f3785c;

    public /* synthetic */ C0273a(Object obj, int i2) {
        this.f3784b = i2;
        this.f3785c = obj;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    /* renamed from: a */
    public void mo314a(Object obj) {
        Window window;
        BookmarksImportFragment this$0 = (BookmarksImportFragment) this.f3785c;
        Uri uri = (Uri) obj;
        String[] strArr = BookmarksImportFragment.f27620i;
        Intrinsics.m32179h(this$0, "this$0");
        View view = null;
        this$0.f27623f = null;
        if (uri != null) {
            this$0.f27622e = uri;
            this$0.m15413c4();
        }
        Dialog dialog = this$0.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            view = window.getDecorView();
        }
        this$0.m15416n4(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) {
        ProfileReleaseNotificationPreferencesPresenter this$0 = (ProfileReleaseNotificationPreferencesPresenter) this.f3785c;
        Intrinsics.m32179h(this$0, "this$0");
        List releases = EmptyList.f63144b;
        if (obj instanceof PageableResponse) {
            Intrinsics.m32177f(obj, "null cannot be cast to non-null type com.swiftsoft.anixartd.network.response.PageableResponse<com.swiftsoft.anixartd.database.entity.Release>");
            releases = ((PageableResponse) obj).getContent();
        } else if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            A a2 = pair.f63055b;
            Intrinsics.m32177f(a2, "null cannot be cast to non-null type com.swiftsoft.anixartd.network.response.common.TypeResponse");
            B b = pair.f63056c;
            Intrinsics.m32177f(b, "null cannot be cast to non-null type com.swiftsoft.anixartd.network.response.PageableResponse<com.swiftsoft.anixartd.database.entity.Release>");
            List content = ((PageableResponse) b).getContent();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Type type : ((TypeResponse) a2).getTypes()) {
                arrayList.add(type.getName());
                arrayList2.add(String.valueOf(type.getId()));
            }
            ProfileReleaseTypeNotificationPreferenceUiLogic profileReleaseTypeNotificationPreferenceUiLogic = this$0.f26548d;
            Object[] array = arrayList.toArray(new String[0]);
            Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Objects.requireNonNull(profileReleaseTypeNotificationPreferenceUiLogic);
            profileReleaseTypeNotificationPreferenceUiLogic.f29142c = (String[]) array;
            ProfileReleaseTypeNotificationPreferenceUiLogic profileReleaseTypeNotificationPreferenceUiLogic2 = this$0.f26548d;
            Object[] array2 = arrayList2.toArray(new String[0]);
            Intrinsics.m32177f(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            Objects.requireNonNull(profileReleaseTypeNotificationPreferenceUiLogic2);
            profileReleaseTypeNotificationPreferenceUiLogic2.f29143d = (String[]) array2;
            releases = content;
        }
        ProfileReleaseTypeNotificationPreferenceUiLogic profileReleaseTypeNotificationPreferenceUiLogic3 = this$0.f26548d;
        Objects.requireNonNull(profileReleaseTypeNotificationPreferenceUiLogic3);
        Intrinsics.m32179h(releases, "releases");
        boolean z = profileReleaseTypeNotificationPreferenceUiLogic3.f29147h;
        if (z) {
            profileReleaseTypeNotificationPreferenceUiLogic3.f29144e.addAll(releases);
        } else {
            if (z) {
                profileReleaseTypeNotificationPreferenceUiLogic3.f29141b = 0;
                profileReleaseTypeNotificationPreferenceUiLogic3.f29146g.clear();
                profileReleaseTypeNotificationPreferenceUiLogic3.f29144e.clear();
                profileReleaseTypeNotificationPreferenceUiLogic3.f29147h = false;
            }
            profileReleaseTypeNotificationPreferenceUiLogic3.f29144e.addAll(releases);
            profileReleaseTypeNotificationPreferenceUiLogic3.f29147h = true;
        }
        ProfileReleaseNotificationPreferencesPresenter.m14753b(this$0, releases.size() >= 25, false, 2);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionManagerProvider
    /* renamed from: b */
    public DrmSessionManager mo2562b(MediaItem mediaItem) {
        return (DrmSessionManager) this.f3785c;
    }

    @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
    /* renamed from: c */
    public long mo2563c(long j2) {
        return ((FlacStreamMetadata) this.f3785c).m6421g(j2);
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    /* renamed from: d */
    public boolean mo2531d(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.f3785c;
        int i2 = BottomSheetDragHandleView.f17679i;
        return bottomSheetDragHandleView.m9868g();
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    /* renamed from: e */
    public boolean mo2557e(InputContentInfoCompat inputContentInfoCompat, int i2, Bundle bundle) {
        View view = (View) this.f3785c;
        if (Build.VERSION.SDK_INT >= 25 && (i2 & 1) != 0) {
            try {
                inputContentInfoCompat.f3779a.mo2559b();
                InputContentInfo inputContentInfo = (InputContentInfo) inputContentInfoCompat.f3779a.mo2561d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        ContentInfoCompat.Builder builder = new ContentInfoCompat.Builder(new ClipData(inputContentInfoCompat.f3779a.getDescription(), new ClipData.Item(inputContentInfoCompat.f3779a.mo2558a())), 2);
        builder.m2061d(inputContentInfoCompat.f3779a.mo2560c());
        builder.m2059b(bundle);
        return ViewCompat.m2182V(view, builder.m2058a()) == null;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        switch (this.f3784b) {
            case 1:
                return Integer.valueOf(((EventStore) this.f3785c).mo5588z());
            case 2:
                ((Uploader) this.f3785c).f9297i.mo5577a();
                return null;
            case 3:
                return ((ClientHealthMetricsStore) this.f3785c).mo5578c();
            default:
                WorkInitializer workInitializer = (WorkInitializer) this.f3785c;
                Iterator<TransportContext> it = workInitializer.f9308b.mo5586a0().iterator();
                while (it.hasNext()) {
                    workInitializer.f9309c.mo5550a(it.next(), 1);
                }
                return null;
        }
    }

    @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener
    /* renamed from: f */
    public void mo2564f(Display display) {
        VideoFrameReleaseHelper videoFrameReleaseHelper = (VideoFrameReleaseHelper) this.f3785c;
        Objects.requireNonNull(videoFrameReleaseHelper);
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            videoFrameReleaseHelper.f14883k = refreshRate;
            videoFrameReleaseHelper.f14884l = (refreshRate * 80) / 100;
        } else {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            videoFrameReleaseHelper.f14883k = -9223372036854775807L;
            videoFrameReleaseHelper.f14884l = -9223372036854775807L;
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    /* renamed from: u */
    public void mo2565u() {
        switch (this.f3784b) {
            case 12:
                TabFragment this$0 = (TabFragment) this.f3785c;
                int i2 = TabFragment.f27884e;
                Intrinsics.m32179h(this$0, "this$0");
                this$0.mo15322u();
                return;
            case 13:
                CollectionCommentsFragment this$02 = (CollectionCommentsFragment) this.f3785c;
                CollectionCommentsFragment.Companion companion = CollectionCommentsFragment.f27910l;
                Intrinsics.m32179h(this$02, "this$0");
                this$02.m15464u();
                return;
            case 14:
                CollectionCommentsRepliesFragment this$03 = (CollectionCommentsRepliesFragment) this.f3785c;
                CollectionCommentsRepliesFragment.Companion companion2 = CollectionCommentsRepliesFragment.f27934o;
                Intrinsics.m32179h(this$03, "this$0");
                this$03.m15467u();
                return;
            case 15:
                CollectionListFragment this$04 = (CollectionListFragment) this.f3785c;
                CollectionListFragment.Companion companion3 = CollectionListFragment.f28000i;
                Intrinsics.m32179h(this$04, "this$0");
                this$04.m15482u();
                return;
            case 16:
                CollectionProfileListFragment this$05 = (CollectionProfileListFragment) this.f3785c;
                CollectionProfileListFragment.Companion companion4 = CollectionProfileListFragment.f28011k;
                Intrinsics.m32179h(this$05, "this$0");
                this$05.m15485u();
                return;
            case 17:
                CommentVotesFragment this$06 = (CommentVotesFragment) this.f3785c;
                CommentVotesFragment.Companion companion5 = CommentVotesFragment.f28050j;
                Intrinsics.m32179h(this$06, "this$0");
                this$06.m15489u();
                return;
            case 18:
                EpisodesUpdatesFragment this$07 = (EpisodesUpdatesFragment) this.f3785c;
                EpisodesUpdatesFragment.Companion companion6 = EpisodesUpdatesFragment.f28138i;
                Intrinsics.m32179h(this$07, "this$0");
                this$07.m15509u();
                return;
            case 19:
                CustomFilterTabFragment this$08 = (CustomFilterTabFragment) this.f3785c;
                KProperty<Object>[] kPropertyArr = CustomFilterTabFragment.f28238h;
                Intrinsics.m32179h(this$08, "this$0");
                this$08.m15516u();
                return;
            case 20:
                NotificationsFragment this$09 = (NotificationsFragment) this.f3785c;
                KProperty<Object>[] kPropertyArr2 = NotificationsFragment.f28273i;
                Intrinsics.m32179h(this$09, "this$0");
                this$09.m15525u();
                return;
            case 21:
                ProfileBlockListFragment this$010 = (ProfileBlockListFragment) this.f3785c;
                KProperty<Object>[] kPropertyArr3 = ProfileBlockListFragment.f28438h;
                Intrinsics.m32179h(this$010, "this$0");
                this$010.m15556u();
                return;
            case 22:
                ProfileChangeLoginHistoryFragment this$011 = (ProfileChangeLoginHistoryFragment) this.f3785c;
                ProfileChangeLoginHistoryFragment.Companion companion7 = ProfileChangeLoginHistoryFragment.f28447i;
                Intrinsics.m32179h(this$011, "this$0");
                this$011.m15559u();
                return;
            case 23:
                ProfileFriendRequestsFragment this$012 = (ProfileFriendRequestsFragment) this.f3785c;
                KProperty<Object>[] kPropertyArr4 = ProfileFriendRequestsFragment.f28527h;
                Intrinsics.m32179h(this$012, "this$0");
                this$012.m15571u();
                return;
            case 24:
                ProfileFriendsFragment this$013 = (ProfileFriendsFragment) this.f3785c;
                ProfileFriendsFragment.Companion companion8 = ProfileFriendsFragment.f28536i;
                Intrinsics.m32179h(this$013, "this$0");
                this$013.m15574u();
                return;
            case 25:
                ProfileOutFriendRequestsFragment this$014 = (ProfileOutFriendRequestsFragment) this.f3785c;
                KProperty<Object>[] kPropertyArr5 = ProfileOutFriendRequestsFragment.f28547h;
                Intrinsics.m32179h(this$014, "this$0");
                this$014.m15577u();
                return;
            case 26:
                ProfileReleaseVideoAppealsFragment this$015 = (ProfileReleaseVideoAppealsFragment) this.f3785c;
                KProperty<Object>[] kPropertyArr6 = ProfileReleaseVideoAppealsFragment.f28568h;
                Intrinsics.m32179h(this$015, "this$0");
                this$015.m15581u();
                return;
            case 27:
                ProfileReleaseVideosAllFragment this$016 = (ProfileReleaseVideosAllFragment) this.f3785c;
                ProfileReleaseVideosAllFragment.Companion companion9 = ProfileReleaseVideosAllFragment.f28579i;
                Intrinsics.m32179h(this$016, "this$0");
                EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) this$016.m15582A3(C2507R.id.recycler_view);
                Intrinsics.m32178g(recycler_view, "recycler_view");
                recycler_view.setVisibility(0);
                ((EpoxyRecyclerView) this$016.m15582A3(C2507R.id.recycler_view)).m3826w0(0);
                EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this$016.f28584g;
                if (endlessRecyclerViewScrollListener == null) {
                    Intrinsics.m32189r("endlessRecyclerViewScrollListener");
                    throw null;
                }
                endlessRecyclerViewScrollListener.m15320g();
                this$016.m15583c4().m14952g();
                return;
            case 28:
                ProfileReleaseUnvotedFragment this$017 = (ProfileReleaseUnvotedFragment) this.f3785c;
                ProfileReleaseUnvotedFragment.Companion companion10 = ProfileReleaseUnvotedFragment.f28604h;
                Intrinsics.m32179h(this$017, "this$0");
                this$017.m15587u();
                return;
            default:
                ProfileReleaseVoteFragment this$018 = (ProfileReleaseVoteFragment) this.f3785c;
                ProfileReleaseVoteFragment.Companion companion11 = ProfileReleaseVoteFragment.f28614i;
                Intrinsics.m32179h(this$018, "this$0");
                this$018.m15590u();
                return;
        }
    }
}
