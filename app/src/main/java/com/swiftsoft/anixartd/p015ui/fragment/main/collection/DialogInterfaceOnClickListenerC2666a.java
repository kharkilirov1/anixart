package com.swiftsoft.anixartd.p015ui.fragment.main.collection;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.database.entity.CollectionComment;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.p015ui.dialog.CommentProcessDialogFragment;
import com.swiftsoft.anixartd.p015ui.fragment.BaseFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionCommentsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.collection.CollectionCommentsRepliesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.comments.CommentVotesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCommentsFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseCommentsRepliesFragment;
import com.swiftsoft.anixartd.p015ui.fragment.main.release.ReleaseFragment;
import com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter;
import com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.Nullable;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.collection.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2666a implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f28024b;

    /* renamed from: c */
    public final /* synthetic */ String[] f28025c;

    /* renamed from: d */
    public final /* synthetic */ Context f28026d;

    /* renamed from: e */
    public final /* synthetic */ Object f28027e;

    /* renamed from: f */
    public final /* synthetic */ Object f28028f;

    public /* synthetic */ DialogInterfaceOnClickListenerC2666a(String[] strArr, BaseFragment baseFragment, Context context, Object obj, int i2) {
        this.f28024b = i2;
        this.f28025c = strArr;
        this.f28028f = baseFragment;
        this.f28026d = context;
        this.f28027e = obj;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, java.lang.String] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.f28024b) {
            case 0:
                String[] items = this.f28025c;
                final CollectionCommentsFragment this$0 = (CollectionCommentsFragment) this.f28028f;
                Context it = this.f28026d;
                final CollectionComment collectionComment = (CollectionComment) this.f28027e;
                CollectionCommentsFragment.Companion companion = CollectionCommentsFragment.f27910l;
                Intrinsics.m32179h(items, "$items");
                Intrinsics.m32179h(this$0, "this$0");
                Intrinsics.m32179h(it, "$it");
                Intrinsics.m32179h(collectionComment, "$collectionComment");
                String str = items[i2];
                if (!Intrinsics.m32174c(str, this$0.getString(C2507R.string.copy_comment_message))) {
                    if (!Intrinsics.m32174c(str, this$0.getString(C2507R.string.show_comment_votes))) {
                        if (!Intrinsics.m32174c(str, this$0.getString(C2507R.string.edit))) {
                            if (!Intrinsics.m32174c(str, this$0.getString(C2507R.string.delete))) {
                                if (!Intrinsics.m32174c(str, this$0.getString(C2507R.string.report))) {
                                    if (Intrinsics.m32174c(str, this$0.getString(C2507R.string.process))) {
                                        CommentProcessDialogFragment.f27708l.m15434a(collectionComment.getId(), collectionComment.getMessage(), collectionComment.getProfile().getBanReason(), Long.valueOf(collectionComment.getProfile().getBanExpires()), collectionComment.getIsSpoiler(), collectionComment.getIsDeleted(), collectionComment.getProfile().getIsBanned()).show(this$0.getChildFragmentManager(), "COMMENT_PROCESS_DIALOG_TAG");
                                        break;
                                    }
                                } else if (!this$0.m15463e4().m14418c()) {
                                    CollectionCommentsPresenter m15463e4 = this$0.m15463e4();
                                    Objects.requireNonNull(m15463e4);
                                    m15463e4.getViewState().mo14447f0(collectionComment);
                                    break;
                                } else {
                                    Dialogs.f30143a.m16305b(this$0);
                                    break;
                                }
                            } else {
                                this$0.m15463e4().m14420f(collectionComment);
                                break;
                            }
                        } else {
                            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            objectRef.f63351b = collectionComment.getMessage();
                            AlertDialog.Builder builder = new AlertDialog.Builder(it, C2507R.style.DialogTheme);
                            final View inflate = this$0.getLayoutInflater().inflate(C2507R.layout.dialog_edit_comment, (ViewGroup) null);
                            builder.setView(inflate);
                            final AlertDialog m378l = builder.m378l();
                            EditText editText = (EditText) inflate.findViewById(C2507R.id.edit_text);
                            editText.setText(collectionComment.getMessage());
                            editText.addTextChangedListener(new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsFragment$onComment$lambda$12$lambda$11$lambda$10$$inlined$addTextChangedListener$default$1
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
                            ((CheckBox) inflate.findViewById(C2507R.id.cb_is_spoiler)).setChecked(collectionComment.getIsSpoiler());
                            MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.positive_button);
                            Intrinsics.m32178g(materialButton, "dialogView.positive_button");
                            ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsFragment$onComment$1$1$2
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
                                        Dialogs dialogs = Dialogs.f30143a;
                                        Context context = inflate.getContext();
                                        Intrinsics.m32178g(context, "dialogView.context");
                                        String string = this$0.getString(C2507R.string.error);
                                        Intrinsics.m32178g(string, "getString(R.string.error)");
                                        String string2 = this$0.getString(C2507R.string.comment_is_too_short);
                                        Intrinsics.m32178g(string2, "getString(R.string.comment_is_too_short)");
                                        dialogs.m16306c(context, string, string2, (r12 & 8) != 0 ? "Ок" : null, null);
                                    } else if (objectRef.f63351b.length() > 720) {
                                        Dialogs dialogs2 = Dialogs.f30143a;
                                        Context context2 = inflate.getContext();
                                        Intrinsics.m32178g(context2, "dialogView.context");
                                        String string3 = this$0.getString(C2507R.string.error);
                                        Intrinsics.m32178g(string3, "getString(R.string.error)");
                                        String string4 = this$0.getString(C2507R.string.comment_is_too_long);
                                        Intrinsics.m32178g(string4, "getString(R.string.comment_is_too_long)");
                                        dialogs2.m16306c(context2, string3, string4, (r12 & 8) != 0 ? "Ок" : null, null);
                                    } else {
                                        m378l.dismiss();
                                        collectionComment.setSpoiler(isChecked);
                                        CollectionCommentsFragment collectionCommentsFragment = this$0;
                                        CollectionCommentsFragment.Companion companion2 = CollectionCommentsFragment.f27910l;
                                        collectionCommentsFragment.m15463e4().m14421g(collectionComment, objectRef.f63351b, isChecked);
                                    }
                                    return Unit.f63088a;
                                }
                            });
                            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
                            Intrinsics.m32178g(materialButton2, "dialogView.negative_button");
                            ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsFragment$onComment$1$1$3
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
                            break;
                        }
                    } else {
                        this$0.m15437u3().mo15324d2(CommentVotesFragment.f28050j.m15490a(collectionComment.getId(), 1), null);
                        break;
                    }
                } else {
                    Object systemService = it.getSystemService("clipboard");
                    Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("data", collectionComment.getMessage()));
                    Dialogs dialogs = Dialogs.f30143a;
                    String string = this$0.getString(C2507R.string.copied);
                    Intrinsics.m32178g(string, "getString(R.string.copied)");
                    dialogs.m16308g(this$0, string, 0);
                    break;
                }
                break;
            case 1:
                String[] items2 = this.f28025c;
                final CollectionCommentsRepliesFragment this$02 = (CollectionCommentsRepliesFragment) this.f28028f;
                Context it2 = this.f28026d;
                final CollectionComment collectionComment2 = (CollectionComment) this.f28027e;
                CollectionCommentsRepliesFragment.Companion companion2 = CollectionCommentsRepliesFragment.f27934o;
                Intrinsics.m32179h(items2, "$items");
                Intrinsics.m32179h(this$02, "this$0");
                Intrinsics.m32179h(it2, "$it");
                Intrinsics.m32179h(collectionComment2, "$collectionComment");
                String str2 = items2[i2];
                if (!Intrinsics.m32174c(str2, this$02.getString(C2507R.string.copy_comment_message))) {
                    if (!Intrinsics.m32174c(str2, this$02.getString(C2507R.string.show_comment_votes))) {
                        if (!Intrinsics.m32174c(str2, this$02.getString(C2507R.string.edit))) {
                            if (!Intrinsics.m32174c(str2, this$02.getString(C2507R.string.delete))) {
                                if (!Intrinsics.m32174c(str2, this$02.getString(C2507R.string.report))) {
                                    if (Intrinsics.m32174c(str2, this$02.getString(C2507R.string.process))) {
                                        CommentProcessDialogFragment.f27708l.m15434a(collectionComment2.getId(), collectionComment2.getMessage(), collectionComment2.getProfile().getBanReason(), Long.valueOf(collectionComment2.getProfile().getBanExpires()), collectionComment2.getIsSpoiler(), collectionComment2.getIsDeleted(), collectionComment2.getProfile().getIsBanned()).show(this$02.getChildFragmentManager(), "COMMENT_PROCESS_DIALOG_TAG");
                                        break;
                                    }
                                } else if (!this$02.m15466c4().m14459c()) {
                                    CollectionCommentsRepliesPresenter m15466c4 = this$02.m15466c4();
                                    Objects.requireNonNull(m15466c4);
                                    m15466c4.getViewState().mo14484f0(collectionComment2);
                                    break;
                                } else {
                                    Dialogs.f30143a.m16305b(this$02);
                                    break;
                                }
                            } else {
                                this$02.m15466c4().m14461e(collectionComment2);
                                break;
                            }
                        } else {
                            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                            objectRef2.f63351b = collectionComment2.getMessage();
                            AlertDialog.Builder builder2 = new AlertDialog.Builder(it2, C2507R.style.DialogTheme);
                            final View inflate2 = this$02.getLayoutInflater().inflate(C2507R.layout.dialog_edit_comment, (ViewGroup) null);
                            builder2.setView(inflate2);
                            final AlertDialog m378l2 = builder2.m378l();
                            EditText editText2 = (EditText) inflate2.findViewById(C2507R.id.edit_text);
                            editText2.setText(collectionComment2.getMessage());
                            editText2.addTextChangedListener(new TextWatcher() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsRepliesFragment$onComment$lambda$13$lambda$12$lambda$11$$inlined$addTextChangedListener$default$1
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
                            ((CheckBox) inflate2.findViewById(C2507R.id.cb_is_spoiler)).setChecked(collectionComment2.getIsSpoiler());
                            MaterialButton materialButton3 = (MaterialButton) inflate2.findViewById(C2507R.id.positive_button);
                            Intrinsics.m32178g(materialButton3, "dialogView.positive_button");
                            ViewsKt.m16377j(materialButton3, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsRepliesFragment$onComment$1$1$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public Unit invoke(View view) {
                                    View it3 = view;
                                    Intrinsics.m32179h(it3, "it");
                                    boolean isChecked = ((CheckBox) inflate2.findViewById(C2507R.id.cb_is_spoiler)).isChecked();
                                    if (objectRef2.f63351b.length() < 5) {
                                        Dialogs dialogs2 = Dialogs.f30143a;
                                        Context context = inflate2.getContext();
                                        Intrinsics.m32178g(context, "dialogView.context");
                                        String string2 = this$02.getString(C2507R.string.error);
                                        Intrinsics.m32178g(string2, "getString(R.string.error)");
                                        String string3 = this$02.getString(C2507R.string.comment_is_too_short);
                                        Intrinsics.m32178g(string3, "getString(R.string.comment_is_too_short)");
                                        dialogs2.m16306c(context, string2, string3, (r12 & 8) != 0 ? "Ок" : null, null);
                                    } else if (objectRef2.f63351b.length() > 720) {
                                        Dialogs dialogs3 = Dialogs.f30143a;
                                        Context context2 = inflate2.getContext();
                                        Intrinsics.m32178g(context2, "dialogView.context");
                                        String string4 = this$02.getString(C2507R.string.error);
                                        Intrinsics.m32178g(string4, "getString(R.string.error)");
                                        String string5 = this$02.getString(C2507R.string.comment_is_too_long);
                                        Intrinsics.m32178g(string5, "getString(R.string.comment_is_too_long)");
                                        dialogs3.m16306c(context2, string4, string5, (r12 & 8) != 0 ? "Ок" : null, null);
                                    } else {
                                        m378l2.dismiss();
                                        collectionComment2.setSpoiler(isChecked);
                                        CollectionCommentsRepliesFragment collectionCommentsRepliesFragment = this$02;
                                        CollectionCommentsRepliesFragment.Companion companion3 = CollectionCommentsRepliesFragment.f27934o;
                                        collectionCommentsRepliesFragment.m15466c4().m14462f(collectionComment2, objectRef2.f63351b, isChecked);
                                    }
                                    return Unit.f63088a;
                                }
                            });
                            MaterialButton materialButton4 = (MaterialButton) inflate2.findViewById(C2507R.id.negative_button);
                            Intrinsics.m32178g(materialButton4, "dialogView.negative_button");
                            ViewsKt.m16377j(materialButton4, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.collection.CollectionCommentsRepliesFragment$onComment$1$1$3
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public Unit invoke(View view) {
                                    View it3 = view;
                                    Intrinsics.m32179h(it3, "it");
                                    AlertDialog.this.dismiss();
                                    return Unit.f63088a;
                                }
                            });
                            break;
                        }
                    } else {
                        this$02.m15437u3().mo15324d2(CommentVotesFragment.f28050j.m15490a(collectionComment2.getId(), 1), null);
                        break;
                    }
                } else {
                    Object systemService2 = it2.getSystemService("clipboard");
                    Intrinsics.m32177f(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText("data", collectionComment2.getMessage()));
                    Dialogs dialogs2 = Dialogs.f30143a;
                    String string2 = this$02.getString(C2507R.string.copied);
                    Intrinsics.m32178g(string2, "getString(R.string.copied)");
                    dialogs2.m16308g(this$02, string2, 0);
                    break;
                }
                break;
            case 2:
                ReleaseCommentsFragment.m15604A3(this.f28025c, (ReleaseCommentsFragment) this.f28028f, this.f28026d, (ReleaseComment) this.f28027e, dialogInterface, i2);
                break;
            case 3:
                ReleaseCommentsRepliesFragment.m15610A3(this.f28025c, (ReleaseCommentsRepliesFragment) this.f28028f, this.f28026d, (ReleaseComment) this.f28027e, dialogInterface, i2);
                break;
            default:
                ReleaseFragment.m15617A3(this.f28025c, (ReleaseFragment) this.f28028f, this.f28026d, (ReleaseComment) this.f28027e, dialogInterface, i2);
                break;
        }
    }
}
