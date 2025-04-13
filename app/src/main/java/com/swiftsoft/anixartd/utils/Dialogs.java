package com.swiftsoft.anixartd.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.activity.AuthActivity;
import com.swiftsoft.anixartd.utils.Dialogs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Dialogs.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Dialogs;", "", "MaterialDialog", "MultiChoiceDialog", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Dialogs {

    /* renamed from: a */
    @NotNull
    public static final Dialogs f30143a = new Dialogs();

    /* compiled from: Dialogs.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Dialogs$MaterialDialog;", "Landroid/app/Dialog;", "Builder", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class MaterialDialog extends Dialog {

        /* renamed from: b */
        public static final /* synthetic */ int f30144b = 0;

        /* compiled from: Dialogs.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Dialogs$MaterialDialog$Builder;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
        public static final class Builder {

            /* renamed from: a */
            @NotNull
            public final Context f30149a;

            /* renamed from: b */
            public int f30150b;

            /* renamed from: c */
            @NotNull
            public String f30151c;

            /* renamed from: d */
            @NotNull
            public String f30152d;

            /* renamed from: e */
            @NotNull
            public String f30153e;

            /* renamed from: f */
            @NotNull
            public String f30154f;

            /* renamed from: g */
            @NotNull
            public String f30155g;

            /* renamed from: h */
            @Nullable
            public Function1<? super MaterialDialog, Unit> f30156h;

            /* renamed from: i */
            @Nullable
            public Function1<? super MaterialDialog, Unit> f30157i;

            /* renamed from: j */
            public boolean f30158j;

            /* renamed from: k */
            public boolean f30159k;

            public Builder(@NotNull Context context) {
                Intrinsics.m32179h(context, "context");
                this.f30149a = context;
                this.f30150b = 3;
                this.f30151c = "";
                this.f30152d = "";
                this.f30153e = "";
                this.f30154f = "";
                this.f30155g = "";
                this.f30158j = true;
            }

            @NotNull
            /* renamed from: a */
            public final Builder m16309a(@StringRes int i2) {
                String string = this.f30149a.getString(i2);
                Intrinsics.m32178g(string, "context.getString(contentRes)");
                this.f30152d = string;
                return this;
            }

            @NotNull
            /* renamed from: b */
            public final Builder m16310b(@NotNull String str) {
                this.f30152d = str;
                return this;
            }

            @NotNull
            /* renamed from: c */
            public final Builder m16311c(@StringRes int i2) {
                String string = this.f30149a.getString(i2);
                Intrinsics.m32178g(string, "context.getString(negativeRes)");
                this.f30153e = string;
                return this;
            }

            @NotNull
            /* renamed from: d */
            public final Builder m16312d(@NotNull String str) {
                this.f30153e = str;
                return this;
            }

            @NotNull
            /* renamed from: e */
            public final Builder m16313e(@NotNull Function1<? super MaterialDialog, Unit> negativeListener) {
                Intrinsics.m32179h(negativeListener, "negativeListener");
                this.f30157i = negativeListener;
                return this;
            }

            @NotNull
            /* renamed from: f */
            public final Builder m16314f(@NotNull Function1<? super MaterialDialog, Unit> positiveListener) {
                Intrinsics.m32179h(positiveListener, "positiveListener");
                this.f30156h = positiveListener;
                return this;
            }

            @NotNull
            /* renamed from: g */
            public final Builder m16315g(@StringRes int i2) {
                String string = this.f30149a.getString(i2);
                Intrinsics.m32178g(string, "context.getString(positiveRes)");
                this.f30154f = string;
                return this;
            }

            @NotNull
            /* renamed from: h */
            public final Builder m16316h(@NotNull String str) {
                this.f30154f = str;
                return this;
            }

            @NotNull
            /* renamed from: i */
            public final MaterialDialog m16317i() {
                MaterialDialog materialDialog = new MaterialDialog(this);
                materialDialog.show();
                return materialDialog;
            }

            @NotNull
            /* renamed from: j */
            public final Builder m16318j(@StringRes int i2) {
                String string = this.f30149a.getString(i2);
                Intrinsics.m32178g(string, "context.getString(titleRes)");
                this.f30151c = string;
                return this;
            }

            @NotNull
            /* renamed from: k */
            public final Builder m16319k(@NotNull String str) {
                this.f30151c = str;
                return this;
            }
        }

        /* compiled from: Dialogs.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Dialogs$MaterialDialog$Companion;", "", "", "CODE_RESEND", "I", "LOADING_BEHAVIOUR", "NORMAL_BEHAVIOUR", "NORMAL_VERT_BEHAVIOUR", "NOTIFY_BEHAVIOUR", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
        public static final class Companion {
        }

        public MaterialDialog(@NotNull final Builder builder) {
            super(builder.f30149a, C2507R.style.DialogTheme);
            requestWindowFeature(1);
            int i2 = builder.f30150b;
            setContentView(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? -1 : C2507R.layout.dialog_confirm : C2507R.layout.dialog_normal_vert : C2507R.layout.dialog_normal : C2507R.layout.dialog_notify : C2507R.layout.dialog_loading);
            setCancelable(builder.f30159k && builder.f30150b != 1);
            Button button = (Button) findViewById(C2507R.id.positive_button);
            Button button2 = (Button) findViewById(C2507R.id.negative_button);
            TextView textView = (TextView) findViewById(C2507R.id.title);
            if (textView != null) {
                textView.setText(builder.f30151c);
            }
            TextView textView2 = (TextView) findViewById(C2507R.id.content);
            if (textView2 != null) {
                textView2.setText(Html.fromHtml(builder.f30152d));
            }
            TextView textView3 = (TextView) findViewById(C2507R.id.content);
            if (textView3 != null) {
                textView3.setMovementMethod(LinkMovementMethod.getInstance());
            }
            if (button != null) {
                button.setText(builder.f30154f);
            }
            if (button2 != null) {
                button2.setText(builder.f30153e);
            }
            TextView textView4 = (TextView) findViewById(C2507R.id.timeLeft);
            if (textView4 != null) {
                textView4.setText(builder.f30155g);
            }
            if (button != null) {
                ViewsKt.m16377j(button, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.utils.Dialogs.MaterialDialog.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(View view) {
                        View it = view;
                        Intrinsics.m32179h(it, "it");
                        Function1<? super MaterialDialog, Unit> function1 = Builder.this.f30156h;
                        if (function1 != null) {
                            function1.invoke(this);
                        }
                        if (Builder.this.f30158j) {
                            this.dismiss();
                        }
                        return Unit.f63088a;
                    }
                });
            }
            if (button2 != null) {
                ViewsKt.m16377j(button2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.utils.Dialogs.MaterialDialog.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(View view) {
                        View it = view;
                        Intrinsics.m32179h(it, "it");
                        Function1<? super MaterialDialog, Unit> function1 = Builder.this.f30157i;
                        if (function1 != null) {
                            function1.invoke(this);
                        }
                        if (Builder.this.f30158j) {
                            this.dismiss();
                        }
                        return Unit.f63088a;
                    }
                });
            }
            setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.swiftsoft.anixartd.utils.a
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Dialogs.MaterialDialog.Builder builder2 = Dialogs.MaterialDialog.Builder.this;
                    Dialogs.MaterialDialog this$0 = this;
                    int i3 = Dialogs.MaterialDialog.f30144b;
                    Intrinsics.m32179h(builder2, "$builder");
                    Intrinsics.m32179h(this$0, "this$0");
                }
            });
        }
    }

    /* compiled from: Dialogs.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Dialogs$MultiChoiceDialog;", "Landroid/app/AlertDialog$Builder;", "Builder", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class MultiChoiceDialog extends AlertDialog.Builder {

        /* compiled from: Dialogs.kt */
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Dialogs$MultiChoiceDialog$Builder;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
        public static final class Builder {
        }
    }

    /* renamed from: e */
    public static void m16303e(Dialogs dialogs, Fragment fragment, String str, String str2, String str3, Function1 function1, int i2) {
        String positiveText = (i2 & 8) != 0 ? "Ок" : null;
        Intrinsics.m32179h(positiveText, "positiveText");
        Context context = fragment.getContext();
        if (context != null) {
            f30143a.m16306c(context, str, str2, positiveText, null);
        }
    }

    /* renamed from: a */
    public final void m16304a(@NotNull final Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, C2507R.style.DialogTheme);
        View inflate = activity.getLayoutInflater().inflate(C2507R.layout.dialog_need_auth, (ViewGroup) null);
        builder.setView(inflate);
        final AlertDialog show = builder.show();
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.auth_button);
        Intrinsics.m32178g(materialButton, "view.auth_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.utils.Dialogs$needAuthDialog$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                Intent intent = new Intent(activity, (Class<?>) AuthActivity.class);
                intent.setFlags(268451840);
                activity.startActivity(intent);
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
        Intrinsics.m32178g(materialButton2, "view.negative_button");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.utils.Dialogs$needAuthDialog$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                show.dismiss();
                return Unit.f63088a;
            }
        });
    }

    /* renamed from: b */
    public final void m16305b(@NotNull final Fragment fragment) {
        AlertDialog.Builder builder = new AlertDialog.Builder(fragment.getContext(), C2507R.style.DialogTheme);
        View inflate = fragment.getLayoutInflater().inflate(C2507R.layout.dialog_need_auth, (ViewGroup) null);
        builder.setView(inflate);
        final AlertDialog show = builder.show();
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(C2507R.id.auth_button);
        Intrinsics.m32178g(materialButton, "view.auth_button");
        ViewsKt.m16377j(materialButton, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.utils.Dialogs$needAuthDialog$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                Fragment fragment2 = Fragment.this;
                Intent intent = new Intent(fragment2.getContext(), (Class<?>) AuthActivity.class);
                intent.setFlags(268451840);
                fragment2.startActivity(intent);
                return Unit.f63088a;
            }
        });
        MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2507R.id.negative_button);
        Intrinsics.m32178g(materialButton2, "view.negative_button");
        ViewsKt.m16377j(materialButton2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.utils.Dialogs$needAuthDialog$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                show.dismiss();
                return Unit.f63088a;
            }
        });
    }

    /* renamed from: c */
    public final void m16306c(@NotNull Context context, @NotNull String title, @NotNull String content, @NotNull String positiveText, @Nullable Function1<? super MaterialDialog, Unit> function1) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(title, "title");
        Intrinsics.m32179h(content, "content");
        Intrinsics.m32179h(positiveText, "positiveText");
        MaterialDialog.Builder builder = new MaterialDialog.Builder(context);
        builder.f30150b = 2;
        builder.m16319k(title);
        builder.m16310b(content);
        builder.m16316h(positiveText);
        if (function1 != null) {
            builder.m16314f(function1);
        }
        builder.m16317i();
    }

    /* renamed from: f */
    public final void m16307f(@NotNull Context context, @NotNull String text) {
        Intrinsics.m32179h(text, "text");
        Toast.makeText(context, text, 0).show();
    }

    /* renamed from: g */
    public final void m16308g(@NotNull Fragment fragment, @NotNull String text, int i2) {
        Intrinsics.m32179h(fragment, "fragment");
        Intrinsics.m32179h(text, "text");
        Context context = fragment.getContext();
        if (context != null) {
            Toast.makeText(context, text, i2).show();
        }
    }
}
