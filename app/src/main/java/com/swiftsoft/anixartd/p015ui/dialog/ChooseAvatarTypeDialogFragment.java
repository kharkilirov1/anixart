package com.swiftsoft.anixartd.p015ui.dialog;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.ViewsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ChooseAvatarTypeDialogFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChooseAvatarTypeDialogFragment;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ChooseAvatarTypeDialogFragment extends BaseDialogFragment {

    /* renamed from: g */
    public static final /* synthetic */ int f27652g = 0;

    /* renamed from: d */
    public boolean f27653d;

    /* renamed from: e */
    public boolean f27654e;

    /* renamed from: f */
    @NotNull
    public Map<Integer, View> f27655f = new LinkedHashMap();

    /* compiled from: ChooseAvatarTypeDialogFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/ChooseAvatarTypeDialogFragment$Companion;", "", "", "CHOOSE_GIF_TYPE_CONTINUE_BUTTON", "Ljava/lang/String;", "CHOOSE_PICTURE_TYPE_CONTINUE_BUTTON", "CHOOSE_SPONSOR_INFO", "IS_SPONSORSHIP_PROMOTION_VALUE", "IS_SPONSOR_VALUE", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27655f.clear();
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f27653d = arguments.getBoolean("IS_SPONSOR_VALUE");
            this.f27654e = arguments.getBoolean("IS_SPONSORSHIP_PROMOTION_VALUE");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(C2507R.layout.dialog_choose_avatar_type, (ViewGroup) null);
            StringBuilder m24u = C0000a.m24u("PROFILE isSponsor => ");
            m24u.append(this.f27653d);
            System.out.println((Object) m24u.toString());
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C2507R.id.upload_gif_layout);
            Intrinsics.m32178g(relativeLayout, "view.upload_gif_layout");
            ViewsKt.m16379l(relativeLayout, this.f27653d);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C2507R.id.sponsor_hint);
            Intrinsics.m32178g(linearLayout, "view.sponsor_hint");
            final int i2 = 1;
            final int i3 = 0;
            ViewsKt.m16373f(linearLayout, !this.f27654e || this.f27653d, false, null, 6);
            TextView textView = (TextView) inflate.findViewById(C2507R.id.gif_hint);
            Intrinsics.m32178g(textView, "view.gif_hint");
            ViewsKt.m16379l(textView, this.f27653d);
            inflate.findViewById(C2507R.id.upload_picture).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.f

                /* renamed from: c */
                public final /* synthetic */ ChooseAvatarTypeDialogFragment f27754c;

                {
                    this.f27754c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            ChooseAvatarTypeDialogFragment this$0 = this.f27754c;
                            int i4 = ChooseAvatarTypeDialogFragment.f27652g;
                            Intrinsics.m32179h(this$0, "this$0");
                            if (this$0.m15411u3("CHOOSE_PICTURE_TYPE_CONTINUE_BUTTON", new Intent())) {
                                this$0.dismiss();
                                break;
                            }
                            break;
                        case 1:
                            ChooseAvatarTypeDialogFragment this$02 = this.f27754c;
                            int i5 = ChooseAvatarTypeDialogFragment.f27652g;
                            Intrinsics.m32179h(this$02, "this$0");
                            if (this$02.m15411u3("CHOOSE_GIF_TYPE_CONTINUE_BUTTON", new Intent())) {
                                this$02.dismiss();
                                break;
                            }
                            break;
                        case 2:
                            ChooseAvatarTypeDialogFragment this$03 = this.f27754c;
                            int i6 = ChooseAvatarTypeDialogFragment.f27652g;
                            Intrinsics.m32179h(this$03, "this$0");
                            if (this$03.m15411u3("CHOOSE_SPONSOR_INFO", new Intent())) {
                                this$03.dismiss();
                                break;
                            }
                            break;
                        default:
                            ChooseAvatarTypeDialogFragment this$04 = this.f27754c;
                            int i7 = ChooseAvatarTypeDialogFragment.f27652g;
                            Intrinsics.m32179h(this$04, "this$0");
                            this$04.dismiss();
                            break;
                    }
                }
            });
            inflate.findViewById(C2507R.id.upload_gif).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.f

                /* renamed from: c */
                public final /* synthetic */ ChooseAvatarTypeDialogFragment f27754c;

                {
                    this.f27754c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            ChooseAvatarTypeDialogFragment this$0 = this.f27754c;
                            int i4 = ChooseAvatarTypeDialogFragment.f27652g;
                            Intrinsics.m32179h(this$0, "this$0");
                            if (this$0.m15411u3("CHOOSE_PICTURE_TYPE_CONTINUE_BUTTON", new Intent())) {
                                this$0.dismiss();
                                break;
                            }
                            break;
                        case 1:
                            ChooseAvatarTypeDialogFragment this$02 = this.f27754c;
                            int i5 = ChooseAvatarTypeDialogFragment.f27652g;
                            Intrinsics.m32179h(this$02, "this$0");
                            if (this$02.m15411u3("CHOOSE_GIF_TYPE_CONTINUE_BUTTON", new Intent())) {
                                this$02.dismiss();
                                break;
                            }
                            break;
                        case 2:
                            ChooseAvatarTypeDialogFragment this$03 = this.f27754c;
                            int i6 = ChooseAvatarTypeDialogFragment.f27652g;
                            Intrinsics.m32179h(this$03, "this$0");
                            if (this$03.m15411u3("CHOOSE_SPONSOR_INFO", new Intent())) {
                                this$03.dismiss();
                                break;
                            }
                            break;
                        default:
                            ChooseAvatarTypeDialogFragment this$04 = this.f27754c;
                            int i7 = ChooseAvatarTypeDialogFragment.f27652g;
                            Intrinsics.m32179h(this$04, "this$0");
                            this$04.dismiss();
                            break;
                    }
                }
            });
            final int i4 = 2;
            ((LinearLayout) inflate.findViewById(C2507R.id.sponsor_hint)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.f

                /* renamed from: c */
                public final /* synthetic */ ChooseAvatarTypeDialogFragment f27754c;

                {
                    this.f27754c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            ChooseAvatarTypeDialogFragment this$0 = this.f27754c;
                            int i42 = ChooseAvatarTypeDialogFragment.f27652g;
                            Intrinsics.m32179h(this$0, "this$0");
                            if (this$0.m15411u3("CHOOSE_PICTURE_TYPE_CONTINUE_BUTTON", new Intent())) {
                                this$0.dismiss();
                                break;
                            }
                            break;
                        case 1:
                            ChooseAvatarTypeDialogFragment this$02 = this.f27754c;
                            int i5 = ChooseAvatarTypeDialogFragment.f27652g;
                            Intrinsics.m32179h(this$02, "this$0");
                            if (this$02.m15411u3("CHOOSE_GIF_TYPE_CONTINUE_BUTTON", new Intent())) {
                                this$02.dismiss();
                                break;
                            }
                            break;
                        case 2:
                            ChooseAvatarTypeDialogFragment this$03 = this.f27754c;
                            int i6 = ChooseAvatarTypeDialogFragment.f27652g;
                            Intrinsics.m32179h(this$03, "this$0");
                            if (this$03.m15411u3("CHOOSE_SPONSOR_INFO", new Intent())) {
                                this$03.dismiss();
                                break;
                            }
                            break;
                        default:
                            ChooseAvatarTypeDialogFragment this$04 = this.f27754c;
                            int i7 = ChooseAvatarTypeDialogFragment.f27652g;
                            Intrinsics.m32179h(this$04, "this$0");
                            this$04.dismiss();
                            break;
                    }
                }
            });
            final int i5 = 3;
            ((MaterialButton) inflate.findViewById(C2507R.id.btnNegative)).setOnClickListener(new View.OnClickListener(this) { // from class: com.swiftsoft.anixartd.ui.dialog.f

                /* renamed from: c */
                public final /* synthetic */ ChooseAvatarTypeDialogFragment f27754c;

                {
                    this.f27754c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            ChooseAvatarTypeDialogFragment this$0 = this.f27754c;
                            int i42 = ChooseAvatarTypeDialogFragment.f27652g;
                            Intrinsics.m32179h(this$0, "this$0");
                            if (this$0.m15411u3("CHOOSE_PICTURE_TYPE_CONTINUE_BUTTON", new Intent())) {
                                this$0.dismiss();
                                break;
                            }
                            break;
                        case 1:
                            ChooseAvatarTypeDialogFragment this$02 = this.f27754c;
                            int i52 = ChooseAvatarTypeDialogFragment.f27652g;
                            Intrinsics.m32179h(this$02, "this$0");
                            if (this$02.m15411u3("CHOOSE_GIF_TYPE_CONTINUE_BUTTON", new Intent())) {
                                this$02.dismiss();
                                break;
                            }
                            break;
                        case 2:
                            ChooseAvatarTypeDialogFragment this$03 = this.f27754c;
                            int i6 = ChooseAvatarTypeDialogFragment.f27652g;
                            Intrinsics.m32179h(this$03, "this$0");
                            if (this$03.m15411u3("CHOOSE_SPONSOR_INFO", new Intent())) {
                                this$03.dismiss();
                                break;
                            }
                            break;
                        default:
                            ChooseAvatarTypeDialogFragment this$04 = this.f27754c;
                            int i7 = ChooseAvatarTypeDialogFragment.f27652g;
                            Intrinsics.m32179h(this$04, "this$0");
                            this$04.dismiss();
                            break;
                    }
                }
            });
            builder.setView(inflate);
        }
        AlertDialog create = builder.create();
        Intrinsics.m32178g(create, "alertDialogBuilder.create()");
        return create;
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment, moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27655f.clear();
    }
}
