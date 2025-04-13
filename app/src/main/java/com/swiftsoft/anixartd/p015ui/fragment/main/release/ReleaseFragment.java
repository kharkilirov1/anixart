package com.swiftsoft.anixartd.p015ui.fragment.main.release;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.PopupMenu;
import androidx.cardview.widget.CardView;
import androidx.core.content.p002pm.ShortcutInfoCompat;
import androidx.core.content.p002pm.ShortcutManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C0919e;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.firebase.auth.C2052a;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.FragmentBalloonLazy;
import com.stfalcon.imageviewer.StfalconImageViewer;
import com.stfalcon.imageviewer.viewer.builder.BuilderData;
import com.swiftsoft.anixart.utils.StringUtils;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.database.entity.ReleaseVideoCategory;
import com.swiftsoft.anixartd.p015ui.activity.MainActivity;
import com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.ChooseTypeDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.CommentProcessDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.BackPressedListener;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.FragmentNavigation;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.DialogInterfaceOnClickListenerC2666a;
import com.swiftsoft.anixartd.p015ui.fragment.main.comments.CommentVotesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.video.ReleaseVideosFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.video.category.ReleaseVideoCategoryFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.report.ReportFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.release.ReleaseUiLogic;
import com.swiftsoft.anixartd.p015ui.tooltip.RandomReleaseBalloonFactory;
import com.swiftsoft.anixartd.presentation.main.release.ReleasePresenter;
import com.swiftsoft.anixartd.presentation.main.release.ReleaseView;
import com.swiftsoft.anixartd.utils.Common;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchRelease;
import com.swiftsoft.anixartd.utils.OnFetchReleaseComment;
import com.swiftsoft.anixartd.utils.OnGlobalSearchByAuthor;
import com.swiftsoft.anixartd.utils.OnGlobalSearchByDirector;
import com.swiftsoft.anixartd.utils.OnGlobalSearchByGenre;
import com.swiftsoft.anixartd.utils.OnGlobalSearchByStudio;
import com.swiftsoft.anixartd.utils.OnProfileListCollection;
import com.swiftsoft.anixartd.utils.OnSnackbar;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.metrica.YandexMetrica;
import com.yandex.mobile.ads.C4632R;
import dagger.Lazy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ReleaseFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\u0010"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/release/ReleaseFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BackPressedListener;", "Lcom/swiftsoft/anixartd/presentation/main/release/ReleaseView;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "Lcom/swiftsoft/anixartd/utils/OnProfileListCollection;", "onProfileListCollection", "", "Lcom/swiftsoft/anixartd/utils/OnFetchRelease;", "onFetchRelease", "Lcom/swiftsoft/anixartd/utils/OnFetchReleaseComment;", "onFetchReleaseComment", "<init>", "()V", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseFragment extends BaseFragment implements BackPressedListener, ReleaseView, BaseDialogFragment.BaseDialogListener {

    /* renamed from: d */
    @Inject
    public Lazy<ReleasePresenter> f28716d;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f28718f;

    /* renamed from: g */
    public long f28719g;

    /* renamed from: h */
    @Nullable
    public Long f28720h;

    /* renamed from: i */
    @Nullable
    public String f28721i;

    /* renamed from: j */
    public boolean f28722j;

    /* renamed from: k */
    public int f28723k;

    /* renamed from: l */
    public long f28724l;

    /* renamed from: m */
    public int f28725m;

    /* renamed from: n */
    public long f28726n;

    /* renamed from: o */
    @Nullable
    public Release f28727o;

    /* renamed from: p */
    @Nullable
    public Release f28728p;

    /* renamed from: q */
    @NotNull
    public Listener f28729q;

    /* renamed from: r */
    @NotNull
    public final kotlin.Lazy f28730r;

    /* renamed from: u */
    public static final /* synthetic */ KProperty<Object>[] f28715u = {C2052a.m12277l(ReleaseFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/release/ReleasePresenter;", 0)};

    /* renamed from: t */
    @NotNull
    public static final Companion f28714t = new Companion(null);

    /* renamed from: s */
    @NotNull
    public Map<Integer, View> f28731s = new LinkedHashMap();

    /* renamed from: e */
    @NotNull
    public final kotlin.Lazy f28717e = new FragmentBalloonLazy(this, Reflection.m32193a(RandomReleaseBalloonFactory.class));

    /* compiled from: ReleaseFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0014\u0010\u0016\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004¨\u0006\u001d"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/release/ReleaseFragment$Companion;", "", "", "CHOOSE_TYPE_TAG", "Ljava/lang/String;", "COMMENT_ID_VALUE", "COMMENT_PROCESS_DIALOG_TAG", "DEEP_LINK_TYPE_RELEASE", "ID_VALUE", "IS_RANDOM_LOADING_VALUE", "", "MIN_VOTE_COUNT", "I", "MPAA_AGE_RATING_0", "MPAA_AGE_RATING_12", "MPAA_AGE_RATING_16", "MPAA_AGE_RATING_18", "MPAA_AGE_RATING_6", "RANDOM_TYPE_ALL", "RANDOM_TYPE_COLLECTION", "RANDOM_TYPE_COLLECTION_ID_VALUE", "RANDOM_TYPE_FAVORITE", "RANDOM_TYPE_PROFILE_LIST", "RANDOM_TYPE_PROFILE_LIST_PROFILE_VALUE", "RANDOM_TYPE_PROFILE_LIST_STATUS_VALUE", "RANDOM_TYPE_VALUE", "RELEASE_FULL_VALUE", "RELEASE_VALUE", "TYPE_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: c */
        public static ReleaseFragment m15624c(Companion companion, boolean z, int i2, Long l2, Integer num, Long l3, int i3) {
            if ((i3 & 4) != 0) {
                l2 = 0L;
            }
            if ((i3 & 8) != 0) {
                num = 0;
            }
            if ((i3 & 16) != 0) {
                l3 = 0L;
            }
            Objects.requireNonNull(companion);
            ReleaseFragment releaseFragment = new ReleaseFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("IS_RANDOM_LOADING_VALUE", z);
            bundle.putInt("RANDOM_TYPE_VALUE", i2);
            if (l2 != null) {
                bundle.putLong("RANDOM_TYPE_PROFILE_LIST_PROFILE_VALUE", l2.longValue());
            }
            if (num != null) {
                bundle.putInt("RANDOM_TYPE_PROFILE_LIST_STATUS_VALUE", num.intValue());
            }
            if (l3 != null) {
                bundle.putLong("RANDOM_TYPE_COLLECTION_ID_VALUE", l3.longValue());
            }
            releaseFragment.setArguments(bundle);
            return releaseFragment;
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final ReleaseFragment m15625a(long j2) {
            ReleaseFragment releaseFragment = new ReleaseFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("ID_VALUE", j2);
            releaseFragment.setArguments(bundle);
            return releaseFragment;
        }

        @JvmStatic
        @NotNull
        /* renamed from: b */
        public final ReleaseFragment m15626b(long j2, @NotNull Release release) {
            ReleaseFragment releaseFragment = new ReleaseFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("ID_VALUE", j2);
            bundle.putSerializable("RELEASE_VALUE", release);
            releaseFragment.setArguments(bundle);
            return releaseFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: ReleaseFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/release/ReleaseFragment$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public interface Listener {
        /* renamed from: a */
        void mo15627a(@NotNull String str);

        /* renamed from: b */
        void mo15628b(@NotNull String str);

        /* renamed from: c */
        void mo15629c(@NotNull String str);

        /* renamed from: d */
        void mo15630d(@NotNull String str);
    }

    public ReleaseFragment() {
        Function0<ReleasePresenter> function0 = new Function0<ReleasePresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ReleasePresenter invoke() {
                Lazy<ReleasePresenter> lazy = ReleaseFragment.this.f28716d;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28718f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ReleasePresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
        this.f28729q = new Listener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment$linkClickListener$1
            @Override // com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment.Listener
            /* renamed from: a */
            public void mo15627a(@NotNull String str) {
                EventBusKt.m16327a(new OnGlobalSearchByDirector(str));
            }

            @Override // com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment.Listener
            /* renamed from: b */
            public void mo15628b(@NotNull String str) {
                EventBusKt.m16327a(new OnGlobalSearchByGenre(str));
            }

            @Override // com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment.Listener
            /* renamed from: c */
            public void mo15629c(@NotNull String str) {
                EventBusKt.m16327a(new OnGlobalSearchByStudio(str));
            }

            @Override // com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment.Listener
            /* renamed from: d */
            public void mo15630d(@NotNull String str) {
                EventBusKt.m16327a(new OnGlobalSearchByAuthor(str));
            }
        };
        this.f28730r = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment$dialog$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Dialogs.MaterialDialog invoke() {
                Context context = ReleaseFragment.this.getContext();
                if (context == null) {
                    return null;
                }
                Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
                builder.f30150b = 1;
                return new Dialogs.MaterialDialog(builder);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [T, java.lang.String] */
    /* renamed from: A3 */
    public static void m15617A3(String[] items, final ReleaseFragment this$0, Context context, final ReleaseComment releaseComment, DialogInterface dialogInterface, int i2) {
        Intrinsics.m32179h(items, "$items");
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(context, "$context");
        Intrinsics.m32179h(releaseComment, "$releaseComment");
        String str = items[i2];
        if (Intrinsics.m32174c(str, this$0.getString(C2507R.string.copy_comment_message))) {
            Object systemService = context.getSystemService("clipboard");
            Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", releaseComment.getMessage()));
            Dialogs dialogs = Dialogs.f30143a;
            String string = this$0.getString(C2507R.string.copied);
            Intrinsics.m32178g(string, "getString(R.string.copied)");
            dialogs.m16308g(this$0, string, 0);
            return;
        }
        if (Intrinsics.m32174c(str, this$0.getString(C2507R.string.show_comment_votes))) {
            this$0.m15437u3().mo15324d2(CommentVotesFragment.f28050j.m15490a(releaseComment.getId(), 0), null);
            return;
        }
        if (!Intrinsics.m32174c(str, this$0.getString(C2507R.string.edit))) {
            if (Intrinsics.m32174c(str, this$0.getString(C2507R.string.delete))) {
                this$0.m15619e4().m15019f(releaseComment);
                return;
            }
            if (!Intrinsics.m32174c(str, this$0.getString(C2507R.string.report))) {
                if (Intrinsics.m32174c(str, this$0.getString(C2507R.string.process))) {
                    CommentProcessDialogFragment.f27708l.m15434a(releaseComment.getId(), releaseComment.getMessage(), releaseComment.getProfile().getBanReason(), Long.valueOf(releaseComment.getProfile().getBanExpires()), releaseComment.getIsSpoiler(), releaseComment.getIsDeleted(), releaseComment.getProfile().getIsBanned()).show(this$0.getChildFragmentManager(), "COMMENT_PROCESS_DIALOG_TAG");
                    return;
                }
                return;
            } else {
                if (this$0.m15619e4().m15015b()) {
                    Dialogs.f30143a.m16305b(this$0);
                    return;
                }
                ReleasePresenter m15619e4 = this$0.m15619e4();
                Objects.requireNonNull(m15619e4);
                m15619e4.getViewState().mo15052c0(releaseComment);
                return;
            }
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f63351b = releaseComment.getMessage();
        AlertDialog.Builder builder = new AlertDialog.Builder(context, C2507R.style.DialogTheme);
        final View inflate = this$0.getLayoutInflater().inflate(C2507R.layout.dialog_edit_comment, (ViewGroup) null);
        builder.setView(inflate);
        final AlertDialog m378l = builder.m378l();
        EditText editText = (EditText) inflate.findViewById(C2507R.id.edit_text);
        editText.setText(releaseComment.getMessage());
        editText.addTextChangedListener(new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment$onComment$lambda$33$lambda$32$lambda$31$$inlined$addTextChangedListener$default$1
            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable) {
                Ref.ObjectRef.this.f63351b = String.valueOf(editable);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence, int i3, int i4, int i5) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence, int i3, int i4, int i5) {
            }
        });
        ((CheckBox) inflate.findViewById(C2507R.id.cb_is_spoiler)).setChecked(releaseComment.getIsSpoiler());
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.positive_button);
        Intrinsics.m32178g(materialButton, "dialogView.positive_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment$onComment$1$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                boolean isChecked = ((CheckBox) inflate.findViewById(C2507R.id.cb_is_spoiler)).isChecked();
                if (objectRef.f63351b.length() < 5) {
                    Dialogs dialogs2 = Dialogs.f30143a;
                    Context context2 = inflate.getContext();
                    Intrinsics.m32178g(context2, "dialogView.context");
                    String string2 = this$0.getString(C2507R.string.error);
                    Intrinsics.m32178g(string2, "getString(R.string.error)");
                    dialogs2.m16306c(context2, string2, "Ваш комментарий слишком короткий. Дайте свободу мысли!", (r12 & 8) != 0 ? "Ок" : null, null);
                } else if (objectRef.f63351b.length() > 720) {
                    Dialogs dialogs3 = Dialogs.f30143a;
                    Context context3 = inflate.getContext();
                    Intrinsics.m32178g(context3, "dialogView.context");
                    String string3 = this$0.getString(C2507R.string.error);
                    Intrinsics.m32178g(string3, "getString(R.string.error)");
                    dialogs3.m16306c(context3, string3, "Ваш комментарий слишком длинный. Краткость – сестра таланта!", (r12 & 8) != 0 ? "Ок" : null, null);
                } else {
                    m378l.dismiss();
                    releaseComment.setSpoiler(isChecked);
                    ReleaseFragment releaseFragment = this$0;
                    ReleaseFragment.Companion companion = ReleaseFragment.f28714t;
                    releaseFragment.m15619e4().m15021h(releaseComment, objectRef.f63351b, ((CheckBox) inflate.findViewById(C2507R.id.cb_is_spoiler)).isChecked());
                }
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
        Intrinsics.m32178g(materialButton2, "dialogView.negative_button");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment$onComment$1$1$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                AlertDialog.this.dismiss();
                return Unit.f63088a;
            }
        });
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: A */
    public void mo15033A() {
        ProgressBar sendProgress = (ProgressBar) m15618c4(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16372e(sendProgress);
        AppCompatImageView send = (AppCompatImageView) m15618c4(C2507R.id.send);
        Intrinsics.m32178g(send, "send");
        ViewsKt.m16378k(send);
        Context context = getContext();
        if (context != null) {
            Dialogs dialogs = Dialogs.f30143a;
            String string = getString(C2507R.string.error);
            Intrinsics.m32178g(string, "getString(R.string.error)");
            String string2 = getString(C2507R.string.error_comment_limit_reached);
            Intrinsics.m32178g(string2, "getString(R.string.error_comment_limit_reached)");
            dialogs.m16306c(context, string, string2, (r12 & 8) != 0 ? "Ок" : null, null);
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BackPressedListener
    /* renamed from: A2 */
    public boolean mo15435A2() {
        Balloon balloon = (Balloon) this.f28717e.getValue();
        if (balloon == null) {
            return true;
        }
        balloon.m13846j();
        return true;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: B */
    public void mo15034B() {
        ((EditText) m15618c4(C2507R.id.comment_editText)).getText().clear();
        String string = getString(C2507R.string.comment_sent);
        Intrinsics.m32178g(string, "getString(R.string.comment_sent)");
        EventBusKt.m16327a(new OnSnackbar(string));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: C3 */
    public void mo15035C3(@NotNull Collection collection) {
        Intrinsics.m32179h(collection, "collection");
        Dialogs dialogs = Dialogs.f30143a;
        StringBuilder m24u = C0000a.m24u("Релиз был успешно добавлен в вашу коллекцию ");
        m24u.append(collection.getTitle());
        dialogs.m16308g(this, m24u.toString(), 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: D */
    public void mo15036D() {
        ProgressBar sendProgress = (ProgressBar) m15618c4(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16372e(sendProgress);
        AppCompatImageView send = (AppCompatImageView) m15618c4(C2507R.id.send);
        Intrinsics.m32178g(send, "send");
        ViewsKt.m16378k(send);
        ((EditText) m15618c4(C2507R.id.comment_editText)).getText().clear();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: F */
    public void mo15037F() {
        ((EditText) m15618c4(C2507R.id.comment_editText)).getText().clear();
        String string = getString(C2507R.string.comment_deleted);
        Intrinsics.m32178g(string, "getString(R.string.comment_deleted)");
        EventBusKt.m16327a(new OnSnackbar(string));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: G */
    public void mo15038G() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_comment_vote_banned);
        Intrinsics.m32178g(string, "getString(R.string.error_comment_vote_banned)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: I0 */
    public void mo15039I0(long j2, long j3, @NotNull String value, @NotNull String name) {
        Intrinsics.m32179h(value, "value");
        Intrinsics.m32179h(name, "name");
        if (j3 == 1) {
            Common common = new Common();
            Context requireContext = requireContext();
            Intrinsics.m32178g(requireContext, "requireContext()");
            common.m16300e(requireContext, value);
            return;
        }
        if (j3 == 0) {
            YandexMetrica.reportEvent("Переход в раздел Видео");
            ReleaseVideoCategory releaseVideoCategory = new ReleaseVideoCategory();
            releaseVideoCategory.setId(Long.parseLong(value));
            releaseVideoCategory.setName(name);
            m15437u3().mo15324d2(ReleaseVideoCategoryFragment.f28855j.m15640a(j2, releaseVideoCategory), null);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: I3 */
    public void mo15040I3(@NotNull Release release) {
        Intrinsics.m32179h(release, "release");
        m15437u3().mo15324d2(ReportFragment.f28867m.m15643a(release, 0), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: P0 */
    public void mo15041P0(@NotNull String screenshot, @NotNull ImageView imageView) {
        Intrinsics.m32179h(screenshot, "screenshot");
        Intrinsics.m32179h(imageView, "imageView");
        List<String> list = m15619e4().f26944h.f29301o;
        StfalconImageViewer.Builder builder = new StfalconImageViewer.Builder(getContext(), list, new C2736k(this, 4));
        int indexOf = list.indexOf(screenshot);
        BuilderData<T> builderData = builder.f25213b;
        builderData.f25267b = indexOf;
        builderData.f25272g = imageView;
        builderData.f25269d = false;
        builder.m14018a();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: P3 */
    public void mo15042P3() {
        ChooseTypeDialogFragment.f27693j.m15432a(m15619e4().f26944h.f29290d, m15619e4().f26944h.f29291e, new ArrayList<>(m15619e4().f26944h.f29292f), true).show(getChildFragmentManager(), "CHOOSE_TYPE_TAG");
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: T2 */
    public void mo15043T2() {
        Dialogs dialogs = Dialogs.f30143a;
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        dialogs.m16306c(requireContext, "Ошибка", "Не удалось добавить на главный экран.", (r12 & 8) != 0 ? "Ок" : null, null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: U */
    public void mo15044U(@NotNull ReleaseComment releaseComment) {
        Intrinsics.m32179h(releaseComment, "releaseComment");
        Context context = getContext();
        if (context != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            ArrayList arrayList = new ArrayList();
            arrayList.add(getString(C2507R.string.show_comment_votes));
            arrayList.add(getString(C2507R.string.copy_comment_message));
            if (releaseComment.getProfile().getId() == m15619e4().f26943g.m14061d()) {
                arrayList.add(getString(C2507R.string.edit));
                arrayList.add(getString(C2507R.string.delete));
            }
            if (releaseComment.getProfile().getId() != m15619e4().f26943g.m14061d()) {
                arrayList.add(getString(C2507R.string.report));
            }
            if (m15619e4().f26943g.m14071n() >= 3 && releaseComment.getProfile().getPrivilegeLevel() <= 1) {
                arrayList.add(getString(C2507R.string.process));
            }
            Object[] array = arrayList.toArray(new String[0]);
            Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            DialogInterfaceOnClickListenerC2666a dialogInterfaceOnClickListenerC2666a = new DialogInterfaceOnClickListenerC2666a(strArr, this, context, releaseComment, 4);
            AlertController.AlertParams alertParams = builder.f413a;
            alertParams.f388q = strArr;
            alertParams.f390s = dialogInterfaceOnClickListenerC2666a;
            AlertDialog create = builder.create();
            Intrinsics.m32178g(create, "myBuilder.create()");
            create.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: W */
    public void mo15045W(@NotNull ReleaseComment releaseComment, int i2) {
        Intrinsics.m32179h(releaseComment, "releaseComment");
        m15619e4().m15027p(releaseComment, i2);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: X */
    public void mo15046X(@NotNull ReleaseComment releaseComment) {
        Intrinsics.m32179h(releaseComment, "releaseComment");
        if (m15619e4().m15015b()) {
            Dialogs.f30143a.m16305b(this);
            return;
        }
        m15619e4().f26944h.m15701a();
        YandexMetrica.reportEvent("Переход в раздел Ответы");
        m15437u3().mo15324d2(ReleaseCommentsRepliesFragment.f28688o.m15616b(this.f28719g, releaseComment.getId(), true), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: Y0 */
    public void mo15047Y0(long j2) {
        YandexMetrica.reportEvent("Переход в раздел Видео");
        FragmentNavigation m15437u3 = m15437u3();
        Objects.requireNonNull(ReleaseVideosFragment.f28827i);
        ReleaseVideosFragment releaseVideosFragment = new ReleaseVideosFragment();
        Bundle bundle = new Bundle();
        bundle.putLong("ID_VALUE", j2);
        releaseVideosFragment.setArguments(bundle);
        m15437u3.mo15324d2(releaseVideosFragment, null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: Z1 */
    public void mo15048Z1() {
        ProgressBar voteProgress = (ProgressBar) m15618c4(C2507R.id.voteProgress);
        Intrinsics.m32178g(voteProgress, "voteProgress");
        ViewsKt.m16380m(voteProgress, false);
        Integer yourVote = m15619e4().f26944h.m15701a().getYourVote();
        if (yourVote != null) {
            int intValue = yourVote.intValue();
            LinearLayout layout_no_voted = (LinearLayout) m15618c4(C2507R.id.layout_no_voted);
            Intrinsics.m32178g(layout_no_voted, "layout_no_voted");
            ViewsKt.m16380m(layout_no_voted, false);
            LinearLayout layout_voted = (LinearLayout) m15618c4(C2507R.id.layout_voted);
            Intrinsics.m32178g(layout_voted, "layout_voted");
            ViewsKt.m16380m(layout_voted, true);
            if (Build.VERSION.SDK_INT == 28) {
                RatingBar rating_bar = (RatingBar) m15618c4(C2507R.id.rating_bar);
                Intrinsics.m32178g(rating_bar, "rating_bar");
                ViewsKt.m16372e(rating_bar);
                LinearLayout rating_bar_text = (LinearLayout) m15618c4(C2507R.id.rating_bar_text);
                Intrinsics.m32178g(rating_bar_text, "rating_bar_text");
                ViewsKt.m16378k(rating_bar_text);
            }
            ((RatingBar) m15618c4(C2507R.id.rating_bar)).setRating(intValue);
            TextView textView = (TextView) m15618c4(C2507R.id.rating_text);
            String string = getString(C2507R.string.rating_text);
            Intrinsics.m32178g(string, "getString(R.string.rating_text)");
            C2052a.m12290y(new Object[]{Integer.valueOf(intValue)}, 1, string, "format(format, *args)", textView);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: a */
    public void mo15049a() {
        ((SwipeRefreshLayout) m15618c4(C2507R.id.refresh)).setEnabled(true);
        LinearLayout progress_bar = (LinearLayout) m15618c4(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
        ProgressBar progressBarFull = (ProgressBar) m15618c4(C2507R.id.progressBarFull);
        Intrinsics.m32178g(progressBarFull, "progressBarFull");
        ViewsKt.m16372e(progressBarFull);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: b */
    public void mo15050b() {
        ((SwipeRefreshLayout) m15618c4(C2507R.id.refresh)).setEnabled(false);
        if (this.f28727o != null) {
            LinearLayout progress_bar = (LinearLayout) m15618c4(C2507R.id.progress_bar);
            Intrinsics.m32178g(progress_bar, "progress_bar");
            ViewsKt.m16378k(progress_bar);
        } else {
            ProgressBar progressBarFull = (ProgressBar) m15618c4(C2507R.id.progressBarFull);
            Intrinsics.m32178g(progressBarFull, "progressBarFull");
            ViewsKt.m16378k(progressBarFull);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: c */
    public void mo15051c() {
        if (this.f28727o == null) {
            NestedScrollView nested_scroll_view = (NestedScrollView) m15618c4(C2507R.id.nested_scroll_view);
            Intrinsics.m32178g(nested_scroll_view, "nested_scroll_view");
            ViewsKt.m16372e(nested_scroll_view);
            LinearLayout error_layout = (LinearLayout) m15618c4(C2507R.id.error_layout);
            Intrinsics.m32178g(error_layout, "error_layout");
            ViewsKt.m16378k(error_layout);
            return;
        }
        LinearLayout video_banners_layout = (LinearLayout) m15618c4(C2507R.id.video_banners_layout);
        Intrinsics.m32178g(video_banners_layout, "video_banners_layout");
        ViewsKt.m16372e(video_banners_layout);
        LinearLayout screenshots_layout = (LinearLayout) m15618c4(C2507R.id.screenshots_layout);
        Intrinsics.m32178g(screenshots_layout, "screenshots_layout");
        ViewsKt.m16372e(screenshots_layout);
        LinearLayout rating_layout = (LinearLayout) m15618c4(C2507R.id.rating_layout);
        Intrinsics.m32178g(rating_layout, "rating_layout");
        ViewsKt.m16372e(rating_layout);
        LinearLayout stats_layout = (LinearLayout) m15618c4(C2507R.id.stats_layout);
        Intrinsics.m32178g(stats_layout, "stats_layout");
        ViewsKt.m16372e(stats_layout);
        LinearLayout related_layout = (LinearLayout) m15618c4(C2507R.id.related_layout);
        Intrinsics.m32178g(related_layout, "related_layout");
        ViewsKt.m16372e(related_layout);
        LinearLayout collections_layout = (LinearLayout) m15618c4(C2507R.id.collections_layout);
        Intrinsics.m32178g(collections_layout, "collections_layout");
        ViewsKt.m16372e(collections_layout);
        LinearLayout recommended_layout = (LinearLayout) m15618c4(C2507R.id.recommended_layout);
        Intrinsics.m32178g(recommended_layout, "recommended_layout");
        ViewsKt.m16372e(recommended_layout);
        LinearLayout comments_layout = (LinearLayout) m15618c4(C2507R.id.comments_layout);
        Intrinsics.m32178g(comments_layout, "comments_layout");
        ViewsKt.m16372e(comments_layout);
        LinearLayout error_layout_info = (LinearLayout) m15618c4(C2507R.id.error_layout_info);
        Intrinsics.m32178g(error_layout_info, "error_layout_info");
        ViewsKt.m16378k(error_layout_info);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: c0 */
    public void mo15052c0(@NotNull ReleaseComment releaseComment) {
        Intrinsics.m32179h(releaseComment, "releaseComment");
        m15437u3().mo15324d2(ReportFragment.f28867m.m15643a(releaseComment, 2), null);
    }

    @Nullable
    /* renamed from: c4 */
    public View m15618c4(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28731s;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i2)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: d */
    public void mo15053d() {
        ((SwipeRefreshLayout) m15618c4(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: e */
    public void mo15054e() {
        ((SwipeRefreshLayout) m15618c4(C2507R.id.refresh)).setRefreshing(false);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: e3 */
    public void mo15055e3() {
        Balloon balloon = (Balloon) this.f28717e.getValue();
        if (balloon != null) {
            FloatingActionButton random = (FloatingActionButton) m15618c4(C2507R.id.random);
            Intrinsics.m32178g(random, "random");
            balloon.m13855s(random, 0, 0);
        }
    }

    /* renamed from: e4 */
    public final ReleasePresenter m15619e4() {
        return (ReleasePresenter) this.f28718f.getValue(this, f28715u[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: f */
    public void mo15056f(long j2) {
        m15437u3().mo15324d2(ProfileFragment.Companion.m15564a(ProfileFragment.f28458k, j2, false, 2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: g */
    public void mo15057g(long j2) {
        m15437u3().mo15324d2(f28714t.m15625a(j2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: h */
    public void mo15058h() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f28730r.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: j */
    public void mo15059j() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f28730r.getValue();
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: m */
    public void mo15060m() {
        Dialogs.f30143a.m16305b(this);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: m3 */
    public void mo15061m3() {
        Dialogs.f30143a.m16308g(this, "Этот релиз уже находится в вашей коллекции", 0);
    }

    /* renamed from: m4 */
    public final void m15620m4(int i2, int i3, int i4, int i5, int i6) {
        if (i2 + i3 + i4 + i5 + i6 <= 0) {
            ((LinearProgressIndicator) m15618c4(C2507R.id.progress_rating_one)).setProgress(0);
            ((LinearProgressIndicator) m15618c4(C2507R.id.progress_rating_two)).setProgress(0);
            ((LinearProgressIndicator) m15618c4(C2507R.id.progress_rating_three)).setProgress(0);
            ((LinearProgressIndicator) m15618c4(C2507R.id.progress_rating_four)).setProgress(0);
            ((LinearProgressIndicator) m15618c4(C2507R.id.progress_rating_five)).setProgress(0);
            return;
        }
        float f2 = i2 > 0 ? (i2 * 100) / r0 : 0.0f;
        float f3 = i3 > 0 ? (i3 * 100) / r0 : 0.0f;
        float f4 = i4 > 0 ? (i4 * 100) / r0 : 0.0f;
        float f5 = i5 > 0 ? (i5 * 100) / r0 : 0.0f;
        float f6 = i6 > 0 ? (i6 * 100) / r0 : 0.0f;
        ((LinearProgressIndicator) m15618c4(C2507R.id.progress_rating_one)).setProgress((int) f2);
        ((LinearProgressIndicator) m15618c4(C2507R.id.progress_rating_two)).setProgress((int) f3);
        ((LinearProgressIndicator) m15618c4(C2507R.id.progress_rating_three)).setProgress((int) f4);
        ((LinearProgressIndicator) m15618c4(C2507R.id.progress_rating_four)).setProgress((int) f5);
        ((LinearProgressIndicator) m15618c4(C2507R.id.progress_rating_five)).setProgress((int) f6);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: n */
    public void mo15062n() {
        Dialogs.f30143a.m16308g(this, "Спасибо! Жалоба отправлена.", 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28731s.clear();
    }

    /* renamed from: n4 */
    public final void m15621n4(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i2 <= 0) {
            CardView statsView = (CardView) m15618c4(C2507R.id.statsView);
            Intrinsics.m32178g(statsView, "statsView");
            ViewsKt.m16372e(statsView);
            return;
        }
        float f2 = i3 > 0 ? (i3 * 100) / i2 : 0.0f;
        float f3 = i4 > 0 ? (i4 * 100) / i2 : 0.0f;
        float f4 = i5 > 0 ? (i5 * 100) / i2 : 0.0f;
        float f5 = i6 > 0 ? (i6 * 100) / i2 : 0.0f;
        float f6 = i7 > 0 ? (i7 * 100) / i2 : 0.0f;
        ViewGroup.LayoutParams layoutParams = m15618c4(C2507R.id.watchingView).getLayoutParams();
        Intrinsics.m32177f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).weight = f2;
        ViewGroup.LayoutParams layoutParams2 = m15618c4(C2507R.id.planView).getLayoutParams();
        Intrinsics.m32177f(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams2).weight = f3;
        ViewGroup.LayoutParams layoutParams3 = m15618c4(C2507R.id.completedView).getLayoutParams();
        Intrinsics.m32177f(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams3).weight = f4;
        ViewGroup.LayoutParams layoutParams4 = m15618c4(C2507R.id.holdOnView).getLayoutParams();
        Intrinsics.m32177f(layoutParams4, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams4).weight = f5;
        ViewGroup.LayoutParams layoutParams5 = m15618c4(C2507R.id.droppedView).getLayoutParams();
        Intrinsics.m32177f(layoutParams5, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams5).weight = f6;
        ((LinearLayout) m15618c4(C2507R.id.statsLine)).requestLayout();
        CardView statsView2 = (CardView) m15618c4(C2507R.id.statsView);
        Intrinsics.m32178g(statsView2, "statsView");
        ViewsKt.m16378k(statsView2);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: o */
    public void mo15063o() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            builder.m16318j(C2507R.string.error);
            String string = getString(C2507R.string.comment_banned);
            Intrinsics.m32178g(string, "getString(R.string.comment_banned)");
            builder.m16310b(string);
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x087b, code lost:
    
        if ((r2 != null && r2.getId() == 0) != false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x03e0, code lost:
    
        if ((r8 == null || r8.length() == 0) == false) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0442 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0518 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x045f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x047e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0497 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0418  */
    /* renamed from: o4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m15622o4(com.swiftsoft.anixartd.database.entity.Release r28) {
        /*
            Method dump skipped, instructions count: 2602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment.m15622o4(com.swiftsoft.anixartd.database.entity.Release):void");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.m32179h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            FragmentTransaction m3024d = fragmentManager.m3024d();
            m3024d.mo2940i(this);
            m3024d.m3116d(this);
            m3024d.mo2936e();
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14146r0(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.containsKey("ID_VALUE")) {
                this.f28719g = arguments.getLong("ID_VALUE");
            }
            if (arguments.containsKey("COMMENT_ID_VALUE")) {
                this.f28720h = Long.valueOf(arguments.getLong("COMMENT_ID_VALUE"));
            }
            if (arguments.containsKey("RELEASE_VALUE")) {
                Serializable serializable = arguments.getSerializable("RELEASE_VALUE");
                Intrinsics.m32177f(serializable, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Release");
                this.f28727o = (Release) serializable;
            }
            if (arguments.containsKey("RELEASE_VALUE_FULL")) {
                Serializable serializable2 = arguments.getSerializable("RELEASE_VALUE_FULL");
                Intrinsics.m32177f(serializable2, "null cannot be cast to non-null type com.swiftsoft.anixartd.database.entity.Release");
                this.f28728p = (Release) serializable2;
            }
            if (arguments.containsKey("IS_RANDOM_LOADING_VALUE")) {
                this.f28722j = arguments.getBoolean("IS_RANDOM_LOADING_VALUE");
            }
            if (arguments.containsKey("RANDOM_TYPE_VALUE")) {
                this.f28723k = arguments.getInt("RANDOM_TYPE_VALUE");
            }
            if (arguments.containsKey("RANDOM_TYPE_PROFILE_LIST_PROFILE_VALUE")) {
                this.f28724l = arguments.getLong("RANDOM_TYPE_PROFILE_LIST_PROFILE_VALUE");
            }
            if (arguments.containsKey("RANDOM_TYPE_PROFILE_LIST_STATUS_VALUE")) {
                this.f28725m = arguments.getInt("RANDOM_TYPE_PROFILE_LIST_STATUS_VALUE");
            }
            if (arguments.containsKey("RANDOM_TYPE_COLLECTION_ID_VALUE")) {
                this.f28726n = arguments.getLong("RANDOM_TYPE_COLLECTION_ID_VALUE");
            }
        }
        if (bundle != null && bundle.containsKey("RELEASE_VALUE_FULL")) {
            Serializable serializable3 = bundle.getSerializable("RELEASE_VALUE_FULL");
            this.f28728p = serializable3 instanceof Release ? (Release) serializable3 : null;
        }
        this.f28721i = StringUtils.f25336a.m14042a(10);
        ReleasePresenter m15619e4 = m15619e4();
        long j2 = this.f28719g;
        int i2 = this.f28723k;
        long j3 = this.f28724l;
        int i3 = this.f28725m;
        long j4 = this.f28726n;
        ReleaseUiLogic releaseUiLogic = m15619e4.f26944h;
        releaseUiLogic.f29288b = j2;
        releaseUiLogic.f29295i = i2;
        releaseUiLogic.f29296j = j3;
        releaseUiLogic.f29297k = i3;
        releaseUiLogic.f29298l = j4;
        releaseUiLogic.f28956a = true;
        HashMap hashMap = new HashMap();
        hashMap.put("id", Long.valueOf(this.f28719g));
        YandexMetrica.reportEvent("Открыт релиз", hashMap);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final View inflate = inflater.inflate(C2507R.layout.fragment_release, viewGroup, false);
        Boolean EXTENDED_MODE = Boolean.TRUE;
        Intrinsics.m32178g(EXTENDED_MODE, "EXTENDED_MODE");
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C2507R.id.watch_panel);
        Intrinsics.m32178g(linearLayout, "view.watch_panel");
        linearLayout.setVisibility(0);
        ((FloatingActionButton) inflate.findViewById(C2507R.id.back)).setOnClickListener(new ViewOnClickListenerC2732g(this, 0));
        FloatingActionButton floatingActionButton = (FloatingActionButton) inflate.findViewById(C2507R.id.random);
        Intrinsics.m32178g(floatingActionButton, "view.random");
        ViewsKt.m16377j(floatingActionButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment$onCreateView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ReleaseFragment releaseFragment = ReleaseFragment.this;
                ReleaseFragment.Companion companion = ReleaseFragment.f28714t;
                Objects.requireNonNull(releaseFragment.m15619e4().f26944h);
                ReleasePresenter presenter = ReleaseFragment.this.m15619e4();
                Intrinsics.m32178g(presenter, "presenter");
                ReleasePresenter.m15012l(presenter, 0, false, false, 7);
                NestedScrollView nestedScrollView = (NestedScrollView) inflate.findViewById(C2507R.id.nested_scroll_view);
                nestedScrollView.m2606A(0 - nestedScrollView.getScrollX(), 0 - nestedScrollView.getScrollY(), 250, false);
                return Unit.f63088a;
            }
        });
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.video_banners_recycler_view);
        epoxyRecyclerView.getContext();
        epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        epoxyRecyclerView.setNestedScrollingEnabled(false);
        epoxyRecyclerView.setController(m15619e4().f26945i);
        EpoxyRecyclerView epoxyRecyclerView2 = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.screenshots_recycler_view);
        epoxyRecyclerView2.getContext();
        epoxyRecyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        epoxyRecyclerView2.setNestedScrollingEnabled(false);
        epoxyRecyclerView2.setController(m15619e4().f26946j);
        EpoxyRecyclerView epoxyRecyclerView3 = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.related_recycler_view);
        epoxyRecyclerView3.getContext();
        int i2 = 1;
        epoxyRecyclerView3.setLayoutManager(new LinearLayoutManager(1, false));
        epoxyRecyclerView3.setNestedScrollingEnabled(false);
        epoxyRecyclerView3.setController(m15619e4().f26947k);
        EpoxyRecyclerView epoxyRecyclerView4 = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recommended_recycler_view);
        epoxyRecyclerView4.getContext();
        epoxyRecyclerView4.setLayoutManager(new LinearLayoutManager(1, false));
        epoxyRecyclerView4.setNestedScrollingEnabled(false);
        epoxyRecyclerView4.setController(m15619e4().f26948l);
        EpoxyRecyclerView epoxyRecyclerView5 = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.comments_recycler_view);
        epoxyRecyclerView5.getContext();
        epoxyRecyclerView5.setLayoutManager(new LinearLayoutManager(1, false));
        epoxyRecyclerView5.setNestedScrollingEnabled(false);
        epoxyRecyclerView5.setController(m15619e4().f26949m);
        ((MaterialButton) inflate.findViewById(C2507R.id.adultBack)).setOnClickListener(new ViewOnClickListenerC2732g(this, i2));
        ((MaterialButton) inflate.findViewById(C2507R.id.adultConfirm)).setOnClickListener(new ViewOnClickListenerC2732g(this, 2));
        ((MaterialButton) inflate.findViewById(C2507R.id.rdBack)).setOnClickListener(new ViewOnClickListenerC2732g(this, 3));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        swipeRefreshLayout.setOnRefreshListener(new C2736k(this, i2));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment$onCreateView$12
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment$onCreateView$13
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh)).setEnabled(true);
                LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C2507R.id.error_layout);
                Intrinsics.m32178g(linearLayout2, "view.error_layout");
                ViewsKt.m16372e(linearLayout2);
                LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(C2507R.id.error_layout);
                Intrinsics.m32178g(linearLayout3, "view.error_layout");
                ViewsKt.m16372e(linearLayout3);
                ReleaseFragment releaseFragment = this;
                ReleaseFragment.Companion companion = ReleaseFragment.f28714t;
                ReleasePresenter presenter = releaseFragment.m15619e4();
                Intrinsics.m32178g(presenter, "presenter");
                ReleasePresenter.m15012l(presenter, 0, false, false, 7);
                return Unit.f63088a;
            }
        });
        AppCompatButton appCompatButton = (AppCompatButton) inflate.findViewById(C2507R.id.repeat_info);
        Intrinsics.m32178g(appCompatButton, "view.repeat_info");
        ViewsKt.m16377j(appCompatButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment$onCreateView$14
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh)).setEnabled(true);
                LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C2507R.id.error_layout_info);
                Intrinsics.m32178g(linearLayout2, "view.error_layout_info");
                ViewsKt.m16372e(linearLayout2);
                ReleaseFragment releaseFragment = this;
                ReleaseFragment.Companion companion = ReleaseFragment.f28714t;
                ReleasePresenter presenter = releaseFragment.m15619e4();
                Intrinsics.m32178g(presenter, "presenter");
                ReleasePresenter.m15012l(presenter, 0, false, false, 7);
                return Unit.f63088a;
            }
        });
        if (this.f28728p == null) {
            ReleasePresenter presenter = m15619e4();
            Intrinsics.m32178g(presenter, "presenter");
            ReleasePresenter.m15012l(presenter, 0, false, false, 7);
        }
        return inflate;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBusKt.m16329c(this);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28731s.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchRelease(@NotNull OnFetchRelease onFetchRelease) {
        Intrinsics.m32179h(onFetchRelease, "onFetchRelease");
        if (m15619e4().f26944h.m15702b()) {
            if (onFetchRelease.f30205a.getId() == m15619e4().f26944h.m15701a().getId()) {
                ReleasePresenter presenter = m15619e4();
                Intrinsics.m32178g(presenter, "presenter");
                presenter.m15025m(1);
            }
        }
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchReleaseComment(@NotNull OnFetchReleaseComment onFetchReleaseComment) {
        Intrinsics.m32179h(onFetchReleaseComment, "onFetchReleaseComment");
        m15619e4().m15022i(onFetchReleaseComment.f30206a);
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onProfileListCollection(@NotNull OnProfileListCollection onProfileListCollection) {
        Intrinsics.m32179h(onProfileListCollection, "onProfileListCollection");
        if (m15619e4().f26944h.m15702b()) {
            if (Intrinsics.m32174c(onProfileListCollection.f30186a, this.f28721i)) {
                Release m15701a = m15619e4().f26944h.m15701a();
                m15619e4().m15016c(onProfileListCollection.f30215b, m15701a);
            }
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        Release release = this.f28728p;
        if (release != null) {
            outState.putSerializable("RELEASE_VALUE_FULL", release);
        }
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.m32179h(view, "view");
        Release release = this.f28727o;
        Release release2 = this.f28728p;
        if (release2 != null) {
            mo15072x3(release2);
        } else if (release != null) {
            m15622o4(release);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: p1 */
    public void mo15064p1() {
        ProgressBar voteProgress = (ProgressBar) m15618c4(C2507R.id.voteProgress);
        Intrinsics.m32178g(voteProgress, "voteProgress");
        ViewsKt.m16380m(voteProgress, false);
        Context context = getContext();
        if (context != null) {
            Dialogs.f30143a.m16306c(context, "Ошибка", "Произошла ошибка при удалении голоса.", (r12 & 8) != 0 ? "Ок" : null, null);
        }
    }

    /* renamed from: p4 */
    public final void m15623p4(@NotNull Release release, @NotNull View view) {
        Intrinsics.m32179h(release, "release");
        PopupMenu popupMenu = new PopupMenu(requireContext(), view);
        popupMenu.m882a().inflate(C2507R.menu.release, popupMenu.f1394b);
        Boolean EXTENDED_MODE = Boolean.TRUE;
        Intrinsics.m32178g(EXTENDED_MODE, "EXTENDED_MODE");
        popupMenu.f1394b.removeItem(C2507R.id.watch);
        popupMenu.f1396d = new C0919e(this, release, 18);
        Context requireContext = requireContext();
        MenuBuilder menuBuilder = popupMenu.f1394b;
        Intrinsics.m32177f(menuBuilder, "null cannot be cast to non-null type androidx.appcompat.view.menu.MenuBuilder");
        MenuPopupHelper menuPopupHelper = new MenuPopupHelper(requireContext, menuBuilder, view);
        menuPopupHelper.m651e(true);
        menuPopupHelper.f939g = 8388613;
        menuPopupHelper.m653g();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: q1 */
    public void mo15065q1(@NotNull final Release release) {
        Intrinsics.m32179h(release, "release");
        Glide.m4872c(getActivity()).m5232g(this).mo4897h().mo4889M(new Common().m16298c(release.getImage(), m15619e4().f26943g.m14082y())).mo5265o(C4632R.styleable.AppCompatTheme_textColorAlertDialogListItem, 148).mo4892a(RequestOptions.m5298E()).m4885I(new CustomTarget<Bitmap>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseFragment$onAddShortcut$1
            @Override // com.bumptech.glide.request.target.Target
            /* renamed from: c */
            public void mo4877c(Object obj, Transition transition) {
                String titleOriginal;
                Bitmap resource = (Bitmap) obj;
                Intrinsics.m32179h(resource, "resource");
                ReleaseFragment releaseFragment = ReleaseFragment.this;
                Release release2 = release;
                Objects.requireNonNull(releaseFragment);
                Intrinsics.m32179h(release2, "release");
                String titleRu = release2.getTitleRu();
                if (titleRu == null || titleRu.length() == 0) {
                    String titleOriginal2 = release2.getTitleOriginal();
                    titleOriginal = !(titleOriginal2 == null || titleOriginal2.length() == 0) ? release2.getTitleOriginal() : "Без названия";
                } else {
                    titleOriginal = release2.getTitleRu();
                }
                Context context = releaseFragment.getContext();
                if (context != null) {
                    StringBuilder m24u = C0000a.m24u("release_");
                    m24u.append(release2.getId());
                    ShortcutInfoCompat.Builder builder = new ShortcutInfoCompat.Builder(context, m24u.toString());
                    builder.f3310a.f3307d = String.valueOf(titleOriginal);
                    PorterDuff.Mode mode = IconCompat.f3400k;
                    IconCompat iconCompat = new IconCompat(1);
                    iconCompat.f3402b = resource;
                    builder.f3310a.f3308e = iconCompat;
                    Intent intent = new Intent(context.getApplicationContext(), (Class<?>) MainActivity.class);
                    intent.setAction("android.intent.action.VIEW");
                    intent.setFlags(335560704);
                    intent.putExtra("TYPE_VALUE", "DEEP_LINK_TYPE_RELEASE");
                    intent.putExtra("ID_VALUE", releaseFragment.f28719g);
                    builder.f3310a.f3306c = new Intent[]{intent};
                    ShortcutInfoCompat m1711a = builder.m1711a();
                    Intrinsics.m32178g(m1711a, "Builder(it, \"release_${r…\n                .build()");
                    if (!ShortcutManagerCompat.m1712a(context)) {
                        releaseFragment.mo15043T2();
                        return;
                    }
                    ShortcutManagerCompat.m1713b(context, m1711a, null);
                    if (Build.VERSION.SDK_INT < 26) {
                        Dialogs dialogs = Dialogs.f30143a;
                        String string = releaseFragment.getString(C2507R.string.shortcut_created);
                        Intrinsics.m32178g(string, "getString(R.string.shortcut_created)");
                        dialogs.m16308g(releaseFragment, string, 0);
                    }
                }
            }

            @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
            /* renamed from: f */
            public void mo5292f(@Nullable Drawable drawable) {
                ReleaseFragment.this.mo15043T2();
            }

            @Override // com.bumptech.glide.request.target.Target
            /* renamed from: k */
            public void mo5296k(@Nullable Drawable drawable) {
            }
        });
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: q2 */
    public void mo15066q2() {
        NestedScrollView release_unavailable_layout = (NestedScrollView) m15618c4(C2507R.id.release_unavailable_layout);
        Intrinsics.m32178g(release_unavailable_layout, "release_unavailable_layout");
        ViewsKt.m16378k(release_unavailable_layout);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: s */
    public void mo15067s() {
        AppCompatImageView send = (AppCompatImageView) m15618c4(C2507R.id.send);
        Intrinsics.m32178g(send, "send");
        ViewsKt.m16372e(send);
        ProgressBar sendProgress = (ProgressBar) m15618c4(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16378k(sendProgress);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: s1 */
    public void mo15068s1() {
        ProgressBar voteProgress = (ProgressBar) m15618c4(C2507R.id.voteProgress);
        Intrinsics.m32178g(voteProgress, "voteProgress");
        ViewsKt.m16380m(voteProgress, true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: u1 */
    public void mo15069u1() {
        ProgressBar voteProgress = (ProgressBar) m15618c4(C2507R.id.voteProgress);
        Intrinsics.m32178g(voteProgress, "voteProgress");
        ViewsKt.m16380m(voteProgress, false);
        Context context = getContext();
        if (context != null) {
            Dialogs.f30143a.m16306c(context, "Ошибка", "Произошла ошибка при отправке голоса.", (r12 & 8) != 0 ? "Ок" : null, null);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: w3 */
    public void mo15070w3() {
        Dialogs.f30143a.m16308g(this, "Вы превысили допустимый лимит релизов в коллекции", 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: x */
    public void mo15071x() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_comment_negative_vote_limit_reached);
        Intrinsics.m32178g(string, "getString(R.string.error…ative_vote_limit_reached)");
        dialogs.m16308g(this, string, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0a11  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x07be  */
    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: x3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo15072x3(@org.jetbrains.annotations.NotNull final com.swiftsoft.anixartd.database.entity.Release r19) {
        /*
            Method dump skipped, instructions count: 2704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment.mo15072x3(com.swiftsoft.anixartd.database.entity.Release):void");
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: y1 */
    public void mo15073y1() {
        ProgressBar voteProgress = (ProgressBar) m15618c4(C2507R.id.voteProgress);
        Intrinsics.m32178g(voteProgress, "voteProgress");
        ViewsKt.m16380m(voteProgress, true);
    }

    @Override // com.swiftsoft.anixartd.ui.dialog.BaseDialogFragment.BaseDialogListener
    /* renamed from: y3 */
    public boolean mo15336y3(@Nullable String str, @NotNull String button, @NotNull Intent intent) {
        ColorStateList valueOf;
        Intrinsics.m32179h(button, "button");
        Intrinsics.m32179h(intent, "intent");
        if (Intrinsics.m32174c(str, "COMMENT_PROCESS_DIALOG_TAG")) {
            long longExtra = intent.getLongExtra("COMMENT_ID_VALUE", 0L);
            String stringExtra = intent.getStringExtra("COMMENT_MESSAGE_VALUE");
            String stringExtra2 = intent.getStringExtra("BAN_REASON_VALUE");
            long longExtra2 = intent.getLongExtra("BAN_EXPIRES_VALUE", 0L);
            boolean booleanExtra = intent.getBooleanExtra("IS_SPOILER_VALUE", false);
            boolean booleanExtra2 = intent.getBooleanExtra("IS_DELETED_VALUE", false);
            boolean booleanExtra3 = intent.getBooleanExtra("IS_BANNED_VALUE", false);
            if (longExtra > 0 && stringExtra != null) {
                m15619e4().m15023j(longExtra, stringExtra, stringExtra2, Long.valueOf(longExtra2), booleanExtra, booleanExtra2, booleanExtra3);
            }
            return true;
        }
        if (!Intrinsics.m32174c(str, "CHOOSE_TYPE_TAG")) {
            return false;
        }
        Serializable serializableExtra = intent.getSerializableExtra("PROFILE_TYPE_NOTIFICATION_PREFERENCES_VALUE");
        ArrayList arrayList = serializableExtra instanceof ArrayList ? (ArrayList) serializableExtra : null;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                String string = getString(C2507R.string.notifications_episodes_enabled);
                Intrinsics.m32178g(string, "getString(R.string.notifications_episodes_enabled)");
                EventBusKt.m16327a(new OnSnackbar(string));
            } else {
                String string2 = getString(C2507R.string.notifications_episodes_disabled);
                Intrinsics.m32178g(string2, "getString(R.string.notif…ations_episodes_disabled)");
                EventBusKt.m16327a(new OnSnackbar(string2));
            }
            FloatingActionButton floatingActionButton = (FloatingActionButton) m15618c4(C2507R.id.release_type_notification_preferences);
            if (!arrayList.isEmpty()) {
                floatingActionButton.setImageDrawable(floatingActionButton.getResources().getDrawable(C2507R.drawable.ic_bell_ring));
                valueOf = ColorStateList.valueOf(floatingActionButton.getResources().getColor(C2507R.color.yellow));
            } else {
                floatingActionButton.setImageDrawable(floatingActionButton.getResources().getDrawable(C2507R.drawable.ic_bell_plus_outline));
                valueOf = ColorStateList.valueOf(ViewsKt.m16370c(floatingActionButton, C2507R.attr.iconTintColor));
            }
            floatingActionButton.setImageTintList(valueOf);
            ReleaseUiLogic releaseUiLogic = m15619e4().f26944h;
            Objects.requireNonNull(releaseUiLogic);
            releaseUiLogic.f29292f.clear();
            releaseUiLogic.f29292f.addAll(arrayList);
            m15619e4().m15024k();
        }
        return true;
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: z0 */
    public void mo15074z0(@NotNull ReleaseComment releaseComment) {
        ReleaseCommentsRepliesFragment m15616b;
        Intrinsics.m32179h(releaseComment, "releaseComment");
        YandexMetrica.reportEvent("Переход в раздел Ответы");
        FragmentNavigation m15437u3 = m15437u3();
        m15616b = ReleaseCommentsRepliesFragment.f28688o.m15616b(this.f28719g, releaseComment.getId(), (r12 & 4) != 0 ? false : false);
        m15437u3.mo15324d2(m15616b, null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: z1 */
    public void mo15075z1() {
        ProgressBar voteProgress = (ProgressBar) m15618c4(C2507R.id.voteProgress);
        Intrinsics.m32178g(voteProgress, "voteProgress");
        ViewsKt.m16380m(voteProgress, false);
        LinearLayout layout_no_voted = (LinearLayout) m15618c4(C2507R.id.layout_no_voted);
        Intrinsics.m32178g(layout_no_voted, "layout_no_voted");
        ViewsKt.m16380m(layout_no_voted, true);
        LinearLayout layout_voted = (LinearLayout) m15618c4(C2507R.id.layout_voted);
        Intrinsics.m32178g(layout_voted, "layout_voted");
        ViewsKt.m16380m(layout_voted, false);
    }
}
