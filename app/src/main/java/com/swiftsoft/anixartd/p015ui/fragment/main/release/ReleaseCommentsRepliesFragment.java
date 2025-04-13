package com.swiftsoft.anixartd.p015ui.fragment.main.release;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.C0576a;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.ViewOnClickListenerC1394a;
import com.google.firebase.auth.C2052a;
import com.google.firebase.components.C2060a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener;
import com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment;
import com.swiftsoft.anixartd.p015ui.dialog.CommentProcessDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.DialogInterfaceOnClickListenerC2666a;
import com.swiftsoft.anixartd.p015ui.fragment.main.comments.CommentVotesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.profile.ProfileFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCommentsRepliesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.report.ReportFragment;
import com.swiftsoft.anixartd.p015ui.logic.main.release.ReleaseCommentsRepliesUiLogic;
import com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter;
import com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.Keyboard;
import com.swiftsoft.anixartd.utils.OnAdVisible;
import com.swiftsoft.anixartd.utils.OnBottomNavigation;
import com.swiftsoft.anixartd.utils.OnCommentingRules;
import com.swiftsoft.anixartd.utils.OnFetchReleaseComment;
import com.swiftsoft.anixartd.utils.OnSnackbar;
import com.swiftsoft.anixartd.utils.OnSoftInputMode;
import com.swiftsoft.anixartd.utils.ViewsKt;
import dagger.Lazy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
import kotlin.reflect.KProperty;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseCommentsRepliesFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/release/ReleaseCommentsRepliesFragment;", "Lcom/swiftsoft/anixartd/ui/fragment/BaseFragment;", "Lcom/swiftsoft/anixartd/presentation/main/release/comments/replies/ReleaseCommentsRepliesView;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment$BaseDialogListener;", "Lcom/swiftsoft/anixartd/utils/OnFetchReleaseComment;", "onFetchReleaseComment", "", "onFetchComment", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseCommentsRepliesFragment extends BaseFragment implements ReleaseCommentsRepliesView, BaseDialogFragment.BaseDialogListener {

    /* renamed from: e */
    @Inject
    public Lazy<ReleaseCommentsRepliesPresenter> f28691e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f28692f;

    /* renamed from: g */
    public long f28693g;

    /* renamed from: h */
    public long f28694h;

    /* renamed from: i */
    @Nullable
    public Long f28695i;

    /* renamed from: j */
    public boolean f28696j;

    /* renamed from: k */
    public boolean f28697k;

    /* renamed from: l */
    public boolean f28698l;

    /* renamed from: m */
    public EndlessRecyclerViewScrollListener f28699m;

    /* renamed from: p */
    public static final /* synthetic */ KProperty<Object>[] f28689p = {C2052a.m12277l(ReleaseCommentsRepliesFragment.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/release/comments/replies/ReleaseCommentsRepliesPresenter;", 0)};

    /* renamed from: o */
    @NotNull
    public static final Companion f28688o = new Companion(null);

    /* renamed from: n */
    @NotNull
    public Map<Integer, View> f28700n = new LinkedHashMap();

    /* renamed from: d */
    @NotNull
    public final kotlin.Lazy f28690d = LazyKt.m31881b(new Function0<Dialogs.MaterialDialog>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsRepliesFragment$dialog$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public Dialogs.MaterialDialog invoke() {
            Context context = ReleaseCommentsRepliesFragment.this.getContext();
            if (context == null) {
                return null;
            }
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 1;
            return new Dialogs.MaterialDialog(builder);
        }
    });

    /* compiled from: ReleaseCommentsRepliesFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/fragment/main/release/ReleaseCommentsRepliesFragment$Companion;", "", "", "COMMENT_ID_VALUE", "Ljava/lang/String;", "COMMENT_PROCESS_DIALOG_TAG", "ID_VALUE", "IS_DIRECT_LOAD", "IS_REPLY_VALUE", "PARENT_COMMENT_ID_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final ReleaseCommentsRepliesFragment m15615a(long j2, long j3, long j4, boolean z) {
            ReleaseCommentsRepliesFragment releaseCommentsRepliesFragment = new ReleaseCommentsRepliesFragment();
            Bundle m4108g = C0576a.m4108g("ID_VALUE", j2);
            m4108g.putLong("PARENT_COMMENT_ID_VALUE", j3);
            m4108g.putLong("COMMENT_ID_VALUE", j4);
            m4108g.putBoolean("IS_DIRECT_LOAD", z);
            releaseCommentsRepliesFragment.setArguments(m4108g);
            return releaseCommentsRepliesFragment;
        }

        @JvmStatic
        @NotNull
        /* renamed from: b */
        public final ReleaseCommentsRepliesFragment m15616b(long j2, long j3, boolean z) {
            ReleaseCommentsRepliesFragment releaseCommentsRepliesFragment = new ReleaseCommentsRepliesFragment();
            Bundle m4108g = C0576a.m4108g("ID_VALUE", j2);
            m4108g.putLong("PARENT_COMMENT_ID_VALUE", j3);
            m4108g.putBoolean("IS_REPLY_VALUE", z);
            releaseCommentsRepliesFragment.setArguments(m4108g);
            return releaseCommentsRepliesFragment;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ReleaseCommentsRepliesFragment() {
        Function0<ReleaseCommentsRepliesPresenter> function0 = new Function0<ReleaseCommentsRepliesPresenter>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsRepliesFragment$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public ReleaseCommentsRepliesPresenter invoke() {
                Lazy<ReleaseCommentsRepliesPresenter> lazy = ReleaseCommentsRepliesFragment.this.f28691e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProviderReleaseComments");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f28692f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(ReleaseCommentsRepliesPresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [T, java.lang.String] */
    /* renamed from: A3 */
    public static void m15610A3(String[] items, final ReleaseCommentsRepliesFragment this$0, Context it, final ReleaseComment releaseComment, DialogInterface dialogInterface, int i2) {
        Intrinsics.m32179h(items, "$items");
        Intrinsics.m32179h(this$0, "this$0");
        Intrinsics.m32179h(it, "$it");
        Intrinsics.m32179h(releaseComment, "$releaseComment");
        String str = items[i2];
        if (Intrinsics.m32174c(str, this$0.getString(C2507R.string.copy_comment_message))) {
            Object systemService = it.getSystemService("clipboard");
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
                this$0.m15612e4().m15123d(releaseComment);
                return;
            }
            if (!Intrinsics.m32174c(str, this$0.getString(C2507R.string.report))) {
                if (Intrinsics.m32174c(str, this$0.getString(C2507R.string.process))) {
                    CommentProcessDialogFragment.f27708l.m15434a(releaseComment.getId(), releaseComment.getMessage(), releaseComment.getProfile().getBanReason(), Long.valueOf(releaseComment.getProfile().getBanExpires()), releaseComment.getIsSpoiler(), releaseComment.getIsDeleted(), releaseComment.getProfile().getIsBanned()).show(this$0.getChildFragmentManager(), "COMMENT_PROCESS_DIALOG_TAG");
                    return;
                }
                return;
            } else {
                if (this$0.m15612e4().m15121b()) {
                    Dialogs.f30143a.m16305b(this$0);
                    return;
                }
                ReleaseCommentsRepliesPresenter m15612e4 = this$0.m15612e4();
                Objects.requireNonNull(m15612e4);
                m15612e4.getViewState().mo15140c0(releaseComment);
                return;
            }
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f63351b = releaseComment.getMessage();
        AlertDialog.Builder builder = new AlertDialog.Builder(it, C2507R.style.DialogTheme);
        final View inflate = this$0.getLayoutInflater().inflate(C2507R.layout.dialog_edit_comment, (ViewGroup) null);
        builder.setView(inflate);
        final AlertDialog m378l = builder.m378l();
        EditText editText = (EditText) inflate.findViewById(C2507R.id.edit_text);
        editText.setText(releaseComment.getMessage());
        editText.addTextChangedListener(new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsRepliesFragment$onComment$lambda$13$lambda$12$lambda$11$$inlined$addTextChangedListener$default$1
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
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsRepliesFragment$onComment$1$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it2 = view;
                Intrinsics.m32179h(it2, "it");
                boolean isChecked = ((CheckBox) inflate.findViewById(C2507R.id.cb_is_spoiler)).isChecked();
                if (objectRef.f63351b.length() < 5) {
                    Dialogs dialogs2 = Dialogs.f30143a;
                    Context context = inflate.getContext();
                    Intrinsics.m32178g(context, "dialogView.context");
                    String string2 = this$0.getString(C2507R.string.error);
                    Intrinsics.m32178g(string2, "getString(R.string.error)");
                    String string3 = this$0.getString(C2507R.string.comment_is_too_short);
                    Intrinsics.m32178g(string3, "getString(R.string.comment_is_too_short)");
                    dialogs2.m16306c(context, string2, string3, (r12 & 8) != 0 ? "Ок" : null, null);
                } else if (objectRef.f63351b.length() > 720) {
                    Dialogs dialogs3 = Dialogs.f30143a;
                    Context context2 = inflate.getContext();
                    Intrinsics.m32178g(context2, "dialogView.context");
                    String string4 = this$0.getString(C2507R.string.error);
                    Intrinsics.m32178g(string4, "getString(R.string.error)");
                    String string5 = this$0.getString(C2507R.string.comment_is_too_long);
                    Intrinsics.m32178g(string5, "getString(R.string.comment_is_too_long)");
                    dialogs3.m16306c(context2, string4, string5, (r12 & 8) != 0 ? "Ок" : null, null);
                } else {
                    m378l.dismiss();
                    releaseComment.setSpoiler(isChecked);
                    ReleaseCommentsRepliesFragment releaseCommentsRepliesFragment = this$0;
                    ReleaseCommentsRepliesFragment.Companion companion = ReleaseCommentsRepliesFragment.f28688o;
                    releaseCommentsRepliesFragment.m15612e4().m15124e(releaseComment, objectRef.f63351b, isChecked);
                }
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
        Intrinsics.m32178g(materialButton2, "dialogView.negative_button");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsRepliesFragment$onComment$1$1$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it2 = view;
                Intrinsics.m32179h(it2, "it");
                AlertDialog.this.dismiss();
                return Unit.f63088a;
            }
        });
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: A */
    public void mo15127A() {
        ProgressBar sendProgress = (ProgressBar) m15611c4(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16372e(sendProgress);
        AppCompatImageView send = (AppCompatImageView) m15611c4(C2507R.id.send);
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

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: B */
    public void mo15128B() {
        ((TextView) m15611c4(C2507R.id.textViewReply)).setText((CharSequence) null);
        RelativeLayout replyPanel = (RelativeLayout) m15611c4(C2507R.id.replyPanel);
        Intrinsics.m32178g(replyPanel, "replyPanel");
        ViewsKt.m16372e(replyPanel);
        m15612e4().f27084d.f29278k = null;
        ((EditText) m15611c4(C2507R.id.comment_editText)).getText().clear();
        String string = getString(C2507R.string.comment_sent);
        Intrinsics.m32178g(string, "getString(R.string.comment_sent)");
        EventBusKt.m16327a(new OnSnackbar(string));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: D */
    public void mo15129D() {
        ProgressBar sendProgress = (ProgressBar) m15611c4(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16372e(sendProgress);
        AppCompatImageView send = (AppCompatImageView) m15611c4(C2507R.id.send);
        Intrinsics.m32178g(send, "send");
        ViewsKt.m16378k(send);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: F */
    public void mo15130F() {
        String string = getString(C2507R.string.comment_deleted);
        Intrinsics.m32178g(string, "getString(R.string.comment_deleted)");
        EventBusKt.m16327a(new OnSnackbar(string));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: G */
    public void mo15131G() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_comment_vote_banned);
        Intrinsics.m32178g(string, "getString(R.string.error_comment_vote_banned)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: H */
    public void mo15132H() {
        ProgressBar sendProgress = (ProgressBar) m15611c4(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16372e(sendProgress);
        AppCompatImageView send = (AppCompatImageView) m15611c4(C2507R.id.send);
        Intrinsics.m32178g(send, "send");
        ViewsKt.m16378k(send);
        Context context = getContext();
        if (context != null) {
            Dialogs dialogs = Dialogs.f30143a;
            String string = getString(C2507R.string.error);
            Intrinsics.m32178g(string, "getString(R.string.error)");
            String string2 = getString(C2507R.string.error_comment_in_block_list);
            Intrinsics.m32178g(string2, "getString(R.string.error_comment_in_block_list)");
            dialogs.m16306c(context, string, string2, (r12 & 8) != 0 ? "Ок" : null, null);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: K2 */
    public void mo15133K2(@NotNull ReleaseComment parentReleaseComment) {
        Intrinsics.m32179h(parentReleaseComment, "parentReleaseComment");
        LinearLayout sendMsgView = (LinearLayout) m15611c4(C2507R.id.sendMsgView);
        Intrinsics.m32178g(sendMsgView, "sendMsgView");
        ViewsKt.m16373f(sendMsgView, parentReleaseComment.getIsDeleted(), false, null, 6);
        if (this.f28696j) {
            this.f28696j = false;
            mo15136X(parentReleaseComment);
        }
        if (this.f28698l) {
            return;
        }
        this.f28698l = true;
        Long l2 = this.f28695i;
        if (l2 != null) {
            long longValue = l2.longValue();
            Iterator<ReleaseComment> it = m15612e4().f27084d.f29275h.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else {
                    if (it.next().getId() == longValue) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            ((EpoxyRecyclerView) m15611c4(C2507R.id.recycler_view)).m3818s0(i2 + 2);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: U */
    public void mo15134U(@NotNull ReleaseComment releaseComment) {
        Context context;
        Intrinsics.m32179h(releaseComment, "releaseComment");
        if (releaseComment.getIsDeleted() || (context = getContext()) == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        ArrayList arrayList = new ArrayList();
        arrayList.add(getString(C2507R.string.show_comment_votes));
        arrayList.add(getString(C2507R.string.copy_comment_message));
        if (releaseComment.getProfile().getId() == m15612e4().f27082b.m14061d()) {
            arrayList.add(getString(C2507R.string.edit));
            arrayList.add(getString(C2507R.string.delete));
        }
        if (releaseComment.getProfile().getId() != m15612e4().f27082b.m14061d()) {
            arrayList.add(getString(C2507R.string.report));
        }
        if (m15612e4().f27082b.m14071n() >= 3 && releaseComment.getProfile().getPrivilegeLevel() <= 1) {
            arrayList.add(getString(C2507R.string.process));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Intrinsics.m32177f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        DialogInterfaceOnClickListenerC2666a dialogInterfaceOnClickListenerC2666a = new DialogInterfaceOnClickListenerC2666a(strArr, this, context, releaseComment, 3);
        AlertController.AlertParams alertParams = builder.f413a;
        alertParams.f388q = strArr;
        alertParams.f390s = dialogInterfaceOnClickListenerC2666a;
        AlertDialog create = builder.create();
        Intrinsics.m32178g(create, "myBuilder.create()");
        create.show();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: W */
    public void mo15135W(@NotNull ReleaseComment releaseComment, int i2) {
        Intrinsics.m32179h(releaseComment, "releaseComment");
        m15612e4().m15126h(releaseComment, i2);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: X */
    public void mo15136X(@NotNull ReleaseComment releaseComment) {
        Intrinsics.m32179h(releaseComment, "releaseComment");
        if (m15612e4().m15121b()) {
            Dialogs.f30143a.m16305b(this);
            return;
        }
        m15612e4().f27084d.m15698d();
        Profile profile = releaseComment.getProfile();
        m15612e4().f27084d.f29278k = profile;
        ((TextView) m15611c4(C2507R.id.textViewReply)).setText(profile.getLogin());
        RelativeLayout replyPanel = (RelativeLayout) m15611c4(C2507R.id.replyPanel);
        Intrinsics.m32178g(replyPanel, "replyPanel");
        ViewsKt.m16378k(replyPanel);
        ((EditText) m15611c4(C2507R.id.comment_editText)).setFocusableInTouchMode(true);
        ((EditText) m15611c4(C2507R.id.comment_editText)).requestFocus();
        ((EditText) m15611c4(C2507R.id.comment_editText)).setText(profile.getLogin() + ", ");
        ((EditText) m15611c4(C2507R.id.comment_editText)).setSelection(((EditText) m15611c4(C2507R.id.comment_editText)).getText().length());
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: a */
    public void mo15137a() {
        ProgressBar progress_bar = (ProgressBar) m15611c4(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: b */
    public void mo15138b() {
        ProgressBar progress_bar = (ProgressBar) m15611c4(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: c */
    public void mo15139c() {
        ((SwipeRefreshLayout) m15611c4(C2507R.id.refresh)).setEnabled(false);
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15611c4(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16372e(recycler_view);
        LinearLayout error_layout = (LinearLayout) m15611c4(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: c0 */
    public void mo15140c0(@NotNull ReleaseComment releaseComment) {
        Intrinsics.m32179h(releaseComment, "releaseComment");
        m15437u3().mo15324d2(ReportFragment.f28867m.m15643a(releaseComment, 2), null);
    }

    @Nullable
    /* renamed from: c4 */
    public View m15611c4(int i2) {
        View findViewById;
        Map<Integer, View> map = this.f28700n;
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

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: d */
    public void mo15141d() {
        ((SwipeRefreshLayout) m15611c4(C2507R.id.refresh)).setRefreshing(true);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: e */
    public void mo15142e() {
        ((SwipeRefreshLayout) m15611c4(C2507R.id.refresh)).setRefreshing(false);
    }

    /* renamed from: e4 */
    public final ReleaseCommentsRepliesPresenter m15612e4() {
        return (ReleaseCommentsRepliesPresenter) this.f28692f.getValue(this, f28689p[0]);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: f */
    public void mo15143f(long j2) {
        m15437u3().mo15324d2(ProfileFragment.Companion.m15564a(ProfileFragment.f28458k, j2, false, 2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: g */
    public void mo15144g(long j2) {
        m15437u3().mo15324d2(ReleaseFragment.f28714t.m15625a(j2), null);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: l */
    public void mo15145l() {
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28699m;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        ReleaseCommentsRepliesPresenter presenter = m15612e4();
        Intrinsics.m32178g(presenter, "presenter");
        ReleaseCommentsRepliesUiLogic releaseCommentsRepliesUiLogic = presenter.f27084d;
        if (releaseCommentsRepliesUiLogic.f28956a) {
            releaseCommentsRepliesUiLogic.m15695a();
            ReleaseCommentsRepliesPresenter.m15120g(presenter, 1, false, false, 4);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: m */
    public void mo15146m() {
        Dialogs.f30143a.m16305b(this);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: n */
    public void mo15147n() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.report_sent);
        Intrinsics.m32178g(string, "getString(R.string.report_sent)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment
    /* renamed from: n3 */
    public void mo15436n3() {
        this.f28700n.clear();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: o */
    public void mo15148o() {
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

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14123g(this);
        super.onCreate(bundle);
        EventBusKt.m16328b(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28693g = arguments.getLong("ID_VALUE");
            this.f28694h = arguments.getLong("PARENT_COMMENT_ID_VALUE");
            if (arguments.containsKey("COMMENT_ID_VALUE")) {
                this.f28695i = Long.valueOf(arguments.getLong("COMMENT_ID_VALUE"));
            }
            this.f28696j = arguments.getBoolean("IS_REPLY_VALUE");
            this.f28697k = arguments.getBoolean("IS_DIRECT_LOAD");
        }
        EventBusKt.m16327a(new OnSoftInputMode(16));
        EventBusKt.m16327a(new OnBottomNavigation(false));
        EventBusKt.m16327a(new OnAdVisible(false));
        ReleaseCommentsRepliesPresenter m15612e4 = m15612e4();
        long j2 = this.f28693g;
        long j3 = this.f28694h;
        boolean z = this.f28697k;
        ReleaseCommentsRepliesUiLogic releaseCommentsRepliesUiLogic = m15612e4.f27084d;
        releaseCommentsRepliesUiLogic.f29269b = j2;
        releaseCommentsRepliesUiLogic.f29270c = j3;
        releaseCommentsRepliesUiLogic.f29271d = z;
        releaseCommentsRepliesUiLogic.f28956a = true;
        ReleaseCommentsRepliesPresenter presenter = m15612e4();
        Intrinsics.m32178g(presenter, "presenter");
        ReleaseCommentsRepliesPresenter.m15120g(presenter, 0, false, false, 7);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.m32179h(inflater, "inflater");
        final int i2 = 0;
        View inflate = inflater.inflate(C2507R.layout.fragment_replies, viewGroup, false);
        ((RelativeLayout) inflate.findViewById(C2507R.id.back)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.e

            /* renamed from: c */
            public final /* synthetic */ ReleaseCommentsRepliesFragment f28809c;

            {
                this.f28809c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        ReleaseCommentsRepliesFragment this$0 = this.f28809c;
                        ReleaseCommentsRepliesFragment.Companion companion = ReleaseCommentsRepliesFragment.f28688o;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    case 1:
                        final ReleaseCommentsRepliesFragment this$02 = this.f28809c;
                        ReleaseCommentsRepliesFragment.Companion companion2 = ReleaseCommentsRepliesFragment.f28688o;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (!this$02.m15612e4().m15121b()) {
                            Context context = this$02.getContext();
                            if (context != null) {
                                final View inflate2 = this$02.getLayoutInflater().inflate(C2507R.layout.bottom_sheet_spoiler, (ViewGroup) null);
                                boolean z = this$02.m15612e4().f27084d.f29279l;
                                final int i3 = 0;
                                final int i4 = 1;
                                if (z) {
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                } else if (!z) {
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                }
                                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
                                bottomSheetDialog.setContentView(inflate2);
                                bottomSheetDialog.show();
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.f
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i3) {
                                            case 0:
                                                ReleaseCommentsRepliesFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                ReleaseCommentsRepliesFragment.Companion companion3 = ReleaseCommentsRepliesFragment.f28688o;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15612e4().f27084d.f29279l = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15611c4(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog, 3), 150L);
                                                break;
                                            default:
                                                ReleaseCommentsRepliesFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                ReleaseCommentsRepliesFragment.Companion companion4 = ReleaseCommentsRepliesFragment.f28688o;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15612e4().f27084d.f29279l = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15611c4(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog2, 2), 150L);
                                                break;
                                        }
                                    }
                                });
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isNotSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.f
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i4) {
                                            case 0:
                                                ReleaseCommentsRepliesFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                ReleaseCommentsRepliesFragment.Companion companion3 = ReleaseCommentsRepliesFragment.f28688o;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15612e4().f27084d.f29279l = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15611c4(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog, 3), 150L);
                                                break;
                                            default:
                                                ReleaseCommentsRepliesFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                ReleaseCommentsRepliesFragment.Companion companion4 = ReleaseCommentsRepliesFragment.f28688o;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15612e4().f27084d.f29279l = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15611c4(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog2, 2), 150L);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } else {
                            Dialogs.f30143a.m16305b(this$02);
                            break;
                        }
                        break;
                    default:
                        ReleaseCommentsRepliesFragment this$03 = this.f28809c;
                        ReleaseCommentsRepliesFragment.Companion companion3 = ReleaseCommentsRepliesFragment.f28688o;
                        Intrinsics.m32179h(this$03, "this$0");
                        if (this$03.m15612e4().m15121b()) {
                            Dialogs.f30143a.m16305b(this$03);
                            break;
                        }
                        break;
                }
            }
        });
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) inflate.findViewById(C2507R.id.recycler_view);
        final RecyclerView.LayoutManager layoutManager = epoxyRecyclerView.getLayoutManager();
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = new EndlessRecyclerViewScrollListener(layoutManager) { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsRepliesFragment$onCreateView$2$1
            @Override // com.swiftsoft.anixartd.p015ui.EndlessRecyclerViewScrollListener
            /* renamed from: e */
            public void mo15318e(int i3, int i4, @Nullable RecyclerView recyclerView) {
            }
        };
        this.f28699m = endlessRecyclerViewScrollListener;
        epoxyRecyclerView.m3806m(endlessRecyclerViewScrollListener);
        epoxyRecyclerView.setController(m15612e4().f27085e);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C2507R.id.refresh);
        final int i3 = 1;
        swipeRefreshLayout.setColorSchemeResources(C2507R.color.refresh_progress);
        swipeRefreshLayout.setProgressBackgroundColorSchemeResource(C2507R.color.refresh_background);
        final int i4 = 2;
        swipeRefreshLayout.setOnRefreshListener(new C2060a(this, i4));
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.help);
        Intrinsics.m32178g(materialButton, "view.help");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsRepliesFragment$onCreateView$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                C2052a.m12281p(view, "it");
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.repeat);
        Intrinsics.m32178g(materialButton2, "view.repeat");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsRepliesFragment$onCreateView$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((SwipeRefreshLayout) ReleaseCommentsRepliesFragment.this.m15611c4(C2507R.id.refresh)).setEnabled(true);
                LinearLayout error_layout = (LinearLayout) ReleaseCommentsRepliesFragment.this.m15611c4(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                ReleaseCommentsRepliesFragment.this.m15613u();
                return Unit.f63088a;
            }
        });
        ((RelativeLayout) inflate.findViewById(C2507R.id.replyPanel)).setOnClickListener(new ViewOnClickListenerC1394a(inflate, this, 4));
        ((LinearLayout) inflate.findViewById(C2507R.id.spoilerPanel)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.e

            /* renamed from: c */
            public final /* synthetic */ ReleaseCommentsRepliesFragment f28809c;

            {
                this.f28809c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        ReleaseCommentsRepliesFragment this$0 = this.f28809c;
                        ReleaseCommentsRepliesFragment.Companion companion = ReleaseCommentsRepliesFragment.f28688o;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    case 1:
                        final ReleaseCommentsRepliesFragment this$02 = this.f28809c;
                        ReleaseCommentsRepliesFragment.Companion companion2 = ReleaseCommentsRepliesFragment.f28688o;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (!this$02.m15612e4().m15121b()) {
                            Context context = this$02.getContext();
                            if (context != null) {
                                final View inflate2 = this$02.getLayoutInflater().inflate(C2507R.layout.bottom_sheet_spoiler, (ViewGroup) null);
                                boolean z = this$02.m15612e4().f27084d.f29279l;
                                final int i32 = 0;
                                final int i42 = 1;
                                if (z) {
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                } else if (!z) {
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                }
                                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
                                bottomSheetDialog.setContentView(inflate2);
                                bottomSheetDialog.show();
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.f
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i32) {
                                            case 0:
                                                ReleaseCommentsRepliesFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                ReleaseCommentsRepliesFragment.Companion companion3 = ReleaseCommentsRepliesFragment.f28688o;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15612e4().f27084d.f29279l = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15611c4(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog, 3), 150L);
                                                break;
                                            default:
                                                ReleaseCommentsRepliesFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                ReleaseCommentsRepliesFragment.Companion companion4 = ReleaseCommentsRepliesFragment.f28688o;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15612e4().f27084d.f29279l = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15611c4(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog2, 2), 150L);
                                                break;
                                        }
                                    }
                                });
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isNotSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.f
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i42) {
                                            case 0:
                                                ReleaseCommentsRepliesFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                ReleaseCommentsRepliesFragment.Companion companion3 = ReleaseCommentsRepliesFragment.f28688o;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15612e4().f27084d.f29279l = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15611c4(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog, 3), 150L);
                                                break;
                                            default:
                                                ReleaseCommentsRepliesFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                ReleaseCommentsRepliesFragment.Companion companion4 = ReleaseCommentsRepliesFragment.f28688o;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15612e4().f27084d.f29279l = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15611c4(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog2, 2), 150L);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } else {
                            Dialogs.f30143a.m16305b(this$02);
                            break;
                        }
                        break;
                    default:
                        ReleaseCommentsRepliesFragment this$03 = this.f28809c;
                        ReleaseCommentsRepliesFragment.Companion companion3 = ReleaseCommentsRepliesFragment.f28688o;
                        Intrinsics.m32179h(this$03, "this$0");
                        if (this$03.m15612e4().m15121b()) {
                            Dialogs.f30143a.m16305b(this$03);
                            break;
                        }
                        break;
                }
            }
        });
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C2507R.id.textViewRules);
        Intrinsics.m32178g(linearLayout, "view.textViewRules");
        ViewsKt.m16377j(linearLayout, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsRepliesFragment$onCreateView$8
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                EventBusKt.m16327a(new OnCommentingRules());
                return Unit.f63088a;
            }
        });
        if (m15612e4().m15121b()) {
            ((EditText) inflate.findViewById(C2507R.id.comment_editText)).setInputType(0);
        }
        ((EditText) inflate.findViewById(C2507R.id.comment_editText)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.e

            /* renamed from: c */
            public final /* synthetic */ ReleaseCommentsRepliesFragment f28809c;

            {
                this.f28809c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        ReleaseCommentsRepliesFragment this$0 = this.f28809c;
                        ReleaseCommentsRepliesFragment.Companion companion = ReleaseCommentsRepliesFragment.f28688o;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.m15437u3().mo15323a3();
                        break;
                    case 1:
                        final ReleaseCommentsRepliesFragment this$02 = this.f28809c;
                        ReleaseCommentsRepliesFragment.Companion companion2 = ReleaseCommentsRepliesFragment.f28688o;
                        Intrinsics.m32179h(this$02, "this$0");
                        if (!this$02.m15612e4().m15121b()) {
                            Context context = this$02.getContext();
                            if (context != null) {
                                final View inflate2 = this$02.getLayoutInflater().inflate(C2507R.layout.bottom_sheet_spoiler, (ViewGroup) null);
                                boolean z = this$02.m15612e4().f27084d.f29279l;
                                final int i32 = 0;
                                final int i42 = 1;
                                if (z) {
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                } else if (!z) {
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                    ((RadioButton) inflate2.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                }
                                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
                                bottomSheetDialog.setContentView(inflate2);
                                bottomSheetDialog.show();
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.f
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i32) {
                                            case 0:
                                                ReleaseCommentsRepliesFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                ReleaseCommentsRepliesFragment.Companion companion3 = ReleaseCommentsRepliesFragment.f28688o;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15612e4().f27084d.f29279l = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15611c4(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog, 3), 150L);
                                                break;
                                            default:
                                                ReleaseCommentsRepliesFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                ReleaseCommentsRepliesFragment.Companion companion4 = ReleaseCommentsRepliesFragment.f28688o;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15612e4().f27084d.f29279l = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15611c4(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog2, 2), 150L);
                                                break;
                                        }
                                    }
                                });
                                ((LinearLayout) inflate2.findViewById(C2507R.id.isNotSpoiler)).setOnClickListener(new View.OnClickListener() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.f
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i42) {
                                            case 0:
                                                ReleaseCommentsRepliesFragment this$03 = this$02;
                                                View view3 = inflate2;
                                                BottomSheetDialog dialog = bottomSheetDialog;
                                                ReleaseCommentsRepliesFragment.Companion companion3 = ReleaseCommentsRepliesFragment.f28688o;
                                                Intrinsics.m32179h(this$03, "this$0");
                                                Intrinsics.m32179h(dialog, "$dialog");
                                                this$03.m15612e4().f27084d.f29279l = true;
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsSpoiler)).setChecked(true);
                                                ((RadioButton) view3.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(false);
                                                ((TextView) this$03.m15611c4(C2507R.id.textViewSpoiler)).setText("содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog, 3), 150L);
                                                break;
                                            default:
                                                ReleaseCommentsRepliesFragment this$04 = this$02;
                                                View view4 = inflate2;
                                                BottomSheetDialog dialog2 = bottomSheetDialog;
                                                ReleaseCommentsRepliesFragment.Companion companion4 = ReleaseCommentsRepliesFragment.f28688o;
                                                Intrinsics.m32179h(this$04, "this$0");
                                                Intrinsics.m32179h(dialog2, "$dialog");
                                                this$04.m15612e4().f27084d.f29279l = false;
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsNotSpoiler)).setChecked(true);
                                                ((RadioButton) view4.findViewById(C2507R.id.rbIsSpoiler)).setChecked(false);
                                                ((TextView) this$04.m15611c4(C2507R.id.textViewSpoiler)).setText("не содержит");
                                                new Handler().postDelayed(new RunnableC2729d(dialog2, 2), 150L);
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } else {
                            Dialogs.f30143a.m16305b(this$02);
                            break;
                        }
                        break;
                    default:
                        ReleaseCommentsRepliesFragment this$03 = this.f28809c;
                        ReleaseCommentsRepliesFragment.Companion companion3 = ReleaseCommentsRepliesFragment.f28688o;
                        Intrinsics.m32179h(this$03, "this$0");
                        if (this$03.m15612e4().m15121b()) {
                            Dialogs.f30143a.m16305b(this$03);
                            break;
                        }
                        break;
                }
            }
        });
        AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(C2507R.id.send);
        Intrinsics.m32178g(appCompatImageView, "view.send");
        ViewsKt.m16377j(appCompatImageView, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.release.ReleaseCommentsRepliesFragment$onCreateView$10
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ReleaseCommentsRepliesFragment releaseCommentsRepliesFragment = ReleaseCommentsRepliesFragment.this;
                ReleaseCommentsRepliesFragment.Companion companion = ReleaseCommentsRepliesFragment.f28688o;
                if (releaseCommentsRepliesFragment.m15612e4().m15121b()) {
                    ReleaseCommentsRepliesFragment releaseCommentsRepliesFragment2 = ReleaseCommentsRepliesFragment.this;
                    Objects.requireNonNull(releaseCommentsRepliesFragment2);
                    Dialogs.f30143a.m16305b(releaseCommentsRepliesFragment2);
                } else {
                    String obj = ((EditText) ReleaseCommentsRepliesFragment.this.m15611c4(C2507R.id.comment_editText)).getText().toString();
                    if (obj.length() < 5) {
                        Context context = ReleaseCommentsRepliesFragment.this.getContext();
                        if (context != null) {
                            ReleaseCommentsRepliesFragment releaseCommentsRepliesFragment3 = ReleaseCommentsRepliesFragment.this;
                            Dialogs dialogs = Dialogs.f30143a;
                            String string = releaseCommentsRepliesFragment3.getString(C2507R.string.error);
                            Intrinsics.m32178g(string, "getString(R.string.error)");
                            String string2 = releaseCommentsRepliesFragment3.getString(C2507R.string.comment_is_too_short);
                            Intrinsics.m32178g(string2, "getString(R.string.comment_is_too_short)");
                            dialogs.m16306c(context, string, string2, (r12 & 8) != 0 ? "Ок" : null, null);
                        }
                    } else if (obj.length() > 720) {
                        Context context2 = ReleaseCommentsRepliesFragment.this.getContext();
                        if (context2 != null) {
                            ReleaseCommentsRepliesFragment releaseCommentsRepliesFragment4 = ReleaseCommentsRepliesFragment.this;
                            Dialogs dialogs2 = Dialogs.f30143a;
                            String string3 = releaseCommentsRepliesFragment4.getString(C2507R.string.error);
                            Intrinsics.m32178g(string3, "getString(R.string.error)");
                            String string4 = releaseCommentsRepliesFragment4.getString(C2507R.string.comment_is_too_long);
                            Intrinsics.m32178g(string4, "getString(R.string.comment_is_too_long)");
                            dialogs2.m16306c(context2, string3, string4, (r12 & 8) != 0 ? "Ок" : null, null);
                        }
                    } else {
                        ReleaseCommentsRepliesFragment.this.m15612e4().m15122c(obj);
                    }
                    Keyboard.f30166a.m16340a(ReleaseCommentsRepliesFragment.this);
                }
                return Unit.f63088a;
            }
        });
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
        this.f28700n.clear();
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onFetchComment(@NotNull OnFetchReleaseComment onFetchReleaseComment) {
        boolean m15696b;
        Intrinsics.m32179h(onFetchReleaseComment, "onFetchReleaseComment");
        ReleaseCommentsRepliesPresenter m15612e4 = m15612e4();
        ReleaseComment releaseComment = onFetchReleaseComment.f30206a;
        Objects.requireNonNull(m15612e4);
        Intrinsics.m32179h(releaseComment, "releaseComment");
        if (m15612e4.f27084d.f28956a) {
            if (releaseComment.getIsDeleted()) {
                long id2 = releaseComment.getId();
                ReleaseCommentsRepliesUiLogic releaseCommentsRepliesUiLogic = m15612e4.f27084d;
                if (id2 != releaseCommentsRepliesUiLogic.f29270c) {
                    Iterator<ReleaseComment> it = releaseCommentsRepliesUiLogic.f29275h.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        } else {
                            if (it.next().getId() == releaseComment.getId()) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (i2 >= 0) {
                        ReleaseComment m15698d = releaseCommentsRepliesUiLogic.m15698d();
                        long j2 = releaseCommentsRepliesUiLogic.f29277j - 1;
                        releaseCommentsRepliesUiLogic.f29277j = j2;
                        m15698d.setReplyCount(j2);
                        releaseCommentsRepliesUiLogic.f29275h.remove(i2);
                    }
                    if (i2 >= 0) {
                        m15696b = true;
                    }
                    m15696b = false;
                } else if (releaseCommentsRepliesUiLogic.f29272e) {
                    m15696b = releaseCommentsRepliesUiLogic.m15696b(releaseComment);
                } else {
                    m15612e4.getViewState().mo15152v0();
                    m15696b = false;
                }
            } else {
                m15696b = m15612e4.f27084d.m15696b(releaseComment);
            }
            if (m15696b) {
                ReleaseCommentsRepliesPresenter.m15119a(m15612e4, false, 1);
            }
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        EventBusKt.m16327a(new OnSoftInputMode(16));
        EventBusKt.m16327a(new OnBottomNavigation(false));
        EventBusKt.m16327a(new OnAdVisible(false));
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: p */
    public void mo15149p() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f28690d.getValue();
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: q */
    public void mo15150q() {
        Dialogs.MaterialDialog materialDialog = (Dialogs.MaterialDialog) this.f28690d.getValue();
        if (materialDialog != null) {
            materialDialog.show();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: s */
    public void mo15151s() {
        AppCompatImageView send = (AppCompatImageView) m15611c4(C2507R.id.send);
        Intrinsics.m32178g(send, "send");
        ViewsKt.m16372e(send);
        ProgressBar sendProgress = (ProgressBar) m15611c4(C2507R.id.sendProgress);
        Intrinsics.m32178g(sendProgress, "sendProgress");
        ViewsKt.m16378k(sendProgress);
    }

    /* renamed from: u */
    public final void m15613u() {
        EpoxyRecyclerView recycler_view = (EpoxyRecyclerView) m15611c4(C2507R.id.recycler_view);
        Intrinsics.m32178g(recycler_view, "recycler_view");
        ViewsKt.m16378k(recycler_view);
        ((EpoxyRecyclerView) m15611c4(C2507R.id.recycler_view)).m3826w0(0);
        EndlessRecyclerViewScrollListener endlessRecyclerViewScrollListener = this.f28699m;
        if (endlessRecyclerViewScrollListener == null) {
            Intrinsics.m32189r("endlessRecyclerViewScrollListener");
            throw null;
        }
        endlessRecyclerViewScrollListener.m15320g();
        ReleaseCommentsRepliesPresenter m15612e4 = m15612e4();
        ReleaseCommentsRepliesUiLogic releaseCommentsRepliesUiLogic = m15612e4.f27084d;
        if (releaseCommentsRepliesUiLogic.f28956a) {
            releaseCommentsRepliesUiLogic.m15695a();
            ReleaseCommentsRepliesPresenter.m15120g(m15612e4, 0, false, true, 1);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: v0 */
    public void mo15152v0() {
        m15437u3().mo15323a3();
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesView
    /* renamed from: x */
    public void mo15153x() {
        Dialogs dialogs = Dialogs.f30143a;
        String string = getString(C2507R.string.error_comment_negative_vote_limit_reached);
        Intrinsics.m32178g(string, "getString(R.string.error…ative_vote_limit_reached)");
        dialogs.m16308g(this, string, 0);
    }

    @Override // com.swiftsoft.anixartd.ui.dialog.BaseDialogFragment.BaseDialogListener
    /* renamed from: y3 */
    public boolean mo15336y3(@Nullable String str, @NotNull String button, @NotNull Intent intent) {
        Intrinsics.m32179h(button, "button");
        Intrinsics.m32179h(intent, "intent");
        if (!Intrinsics.m32174c(str, "COMMENT_PROCESS_DIALOG_TAG")) {
            return false;
        }
        long longExtra = intent.getLongExtra("COMMENT_ID_VALUE", 0L);
        String stringExtra = intent.getStringExtra("COMMENT_MESSAGE_VALUE");
        String stringExtra2 = intent.getStringExtra("BAN_REASON_VALUE");
        long longExtra2 = intent.getLongExtra("BAN_EXPIRES_VALUE", 0L);
        boolean booleanExtra = intent.getBooleanExtra("IS_SPOILER_VALUE", false);
        boolean booleanExtra2 = intent.getBooleanExtra("IS_DELETED_VALUE", false);
        boolean booleanExtra3 = intent.getBooleanExtra("IS_BANNED_VALUE", false);
        if (longExtra <= 0 || stringExtra == null) {
            return true;
        }
        m15612e4().m15125f(longExtra, stringExtra, stringExtra2, Long.valueOf(longExtra2), booleanExtra, booleanExtra2, booleanExtra3);
        return true;
    }
}
