package com.swiftsoft.anixartd.p015ui.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.inputmethod.C0273a;
import androidx.documentfile.provider.DocumentFile;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.importer.Importer;
import com.swiftsoft.anixartd.importer.ShikimoriImporter;
import com.swiftsoft.anixartd.p015ui.activity.ViewOnClickListenerC2625a;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.swiftsoft.anixartd.utils.radiobutton.CustomRadioGroup;
import com.swiftsoft.anixartd.utils.radiobutton.types.TwoFieldsRadioButton;
import com.yandex.mobile.ads.C4632R;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions;
import pub.devrel.easypermissions.PermissionRequest;

/* compiled from: BookmarksImportFragment.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\b"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/BookmarksImportFragment;", "Lcom/swiftsoft/anixartd/ui/dialog/BaseDialogFragment;", "Lcom/swiftsoft/anixartd/utils/radiobutton/CustomRadioGroup$OnRadioButtonListener;", "", "onChooseJson", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BookmarksImportFragment extends BaseDialogFragment implements CustomRadioGroup.OnRadioButtonListener {

    /* renamed from: i */
    @NotNull
    public static final String[] f27620i = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* renamed from: d */
    @Nullable
    public String f27621d;

    /* renamed from: e */
    @Nullable
    public Uri f27622e;

    /* renamed from: f */
    @Nullable
    public Importer f27623f;

    /* renamed from: g */
    @NotNull
    public final ActivityResultLauncher<String> f27624g;

    /* renamed from: h */
    @NotNull
    public Map<Integer, View> f27625h = new LinkedHashMap();

    /* compiled from: BookmarksImportFragment.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/dialog/BookmarksImportFragment$Companion;", "", "", "CHOOSE_TYPE_CONTINUE_BUTTON", "Ljava/lang/String;", "", "RC_STORAGE", "I", "SELECTED_DOCUMENT_URI_VALUE", "SELECTED_IMPORTER_NAME_VALUE", "STATUS_COMPLETED_VALUE", "STATUS_DROPPED_VALUE", "STATUS_HOLD_ON_VALUE", "STATUS_PLANS_VALUE", "STATUS_WATCHING_VALUE", "", "STORAGE", "[Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public BookmarksImportFragment() {
        ActivityResultLauncher<String> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.GetContent(), new C0273a(this, 11));
        Intrinsics.m32178g(registerForActivityResult, "registerForActivityResul…dow?.decorView)\n        }");
        this.f27624g = registerForActivityResult;
    }

    /* renamed from: A3 */
    public static void m15412A3(final BookmarksImportFragment this$0, View view) {
        Intrinsics.m32179h(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        final String str = this$0.f27621d;
        if (str == null) {
            this$0.m15415m4();
            return;
        }
        final Importer importer = this$0.f27623f;
        if (importer == null) {
            return;
        }
        importer.mo14166a(requireContext, new Function1<Importer, Unit>() { // from class: com.swiftsoft.anixartd.ui.dialog.BookmarksImportFragment$onCreateDialog$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Importer importer2) {
                Importer it = importer2;
                Intrinsics.m32179h(it, "it");
                Intent intent = new Intent();
                intent.putExtra("SELECTED_IMPORTER_NAME_VALUE", str);
                intent.putExtra("STATUS_WATCHING_VALUE", importer.f25760b);
                intent.putExtra("STATUS_PLANS_VALUE", importer.f25761c);
                intent.putExtra("STATUS_COMPLETED_VALUE", importer.f25762d);
                intent.putExtra("STATUS_HOLD_ON_VALUE", importer.f25764f);
                intent.putExtra("STATUS_DROPPED_VALUE", importer.f25763e);
                if (this$0.m15411u3("CHOOSE_TYPE_CONTINUE_BUTTON", intent)) {
                    this$0.dismiss();
                }
                return Unit.f63088a;
            }
        });
    }

    /* renamed from: c4 */
    public final void m15413c4() {
        Context requireContext = requireContext();
        Intrinsics.m32178g(requireContext, "requireContext()");
        String str = this.f27621d;
        if (str == null) {
            m15415m4();
            return;
        }
        Uri uri = this.f27622e;
        if (uri == null) {
            m15414e4();
            return;
        }
        InputStream openInputStream = requireContext.getContentResolver().openInputStream(DocumentFile.m2748b(requireContext, uri).mo2751d());
        if (openInputStream == null) {
            m15414e4();
            return;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(openInputStream);
        try {
        } catch (Exception unused) {
            m15414e4();
        }
        if (!Intrinsics.m32174c(str, "Shikimori")) {
            throw new Exception("Invalid importer name");
        }
        ShikimoriImporter shikimoriImporter = new ShikimoriImporter();
        shikimoriImporter.m14167b(inputStreamReader);
        this.f27623f = shikimoriImporter;
        inputStreamReader.close();
    }

    /* renamed from: e4 */
    public final void m15414e4() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            builder.m16318j(C2507R.string.error);
            String string = context.getString(C2507R.string.import_invalid_file);
            Intrinsics.m32178g(string, "getString(R.string.import_invalid_file)");
            builder.m16310b(string);
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }

    /* renamed from: m4 */
    public final void m15415m4() {
        Context context = getContext();
        if (context != null) {
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(context);
            builder.f30150b = 2;
            builder.m16318j(C2507R.string.error);
            String string = context.getString(C2507R.string.import_invalid_importer_name);
            Intrinsics.m32178g(string, "getString(R.string.import_invalid_importer_name)");
            builder.m16310b(string);
            builder.m16315g(C2507R.string.ok);
            builder.m16317i();
        }
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment
    /* renamed from: n3 */
    public void mo15410n3() {
        this.f27625h.clear();
    }

    /* renamed from: n4 */
    public final void m15416n4(View view) {
        if (view != null) {
            TextView textView = (TextView) view.findViewById(C2507R.id.choose);
            TextView chosen = (TextView) view.findViewById(C2507R.id.chosen);
            MaterialButton materialButton = (MaterialButton) view.findViewById(C2507R.id.btnContinue);
            if (this.f27623f != null) {
                textView.setText(view.getContext().getString(C2507R.string.import_drop_file_another));
                Intrinsics.m32178g(chosen, "chosen");
                ViewsKt.m16380m(chosen, true);
                materialButton.setEnabled(true);
                materialButton.setAlpha(1.0f);
                return;
            }
            textView.setText(view.getContext().getString(C2507R.string.import_drop_file));
            Intrinsics.m32178g(chosen, "chosen");
            ViewsKt.m16380m(chosen, false);
            materialButton.setEnabled(false);
            materialButton.setAlpha(0.3f);
        }
    }

    @AfterPermissionGranted(C4632R.styleable.AppCompatTheme_windowMinWidthMajor)
    public final void onChooseJson() {
        Context context = getContext();
        if (context != null) {
            String[] strArr = f27620i;
            if (EasyPermissions.m34989a(context, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                this.f27624g.mo315a("application/json", null);
            } else {
                EasyPermissions.m34991c(new PermissionRequest.Builder(this, C4632R.styleable.AppCompatTheme_windowMinWidthMajor, (String[]) Arrays.copyOf(strArr, strArr.length)).m34997a());
            }
        }
    }

    @Override // com.swiftsoft.anixartd.utils.radiobutton.CustomRadioGroup.OnRadioButtonListener
    public void onClick(@NotNull View view) {
        Intrinsics.m32179h(view, "view");
        if (view.getId() == C2507R.id.itemShikimori) {
            this.f27621d = "Shikimori";
        }
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.f27621d = "Shikimori";
        if (bundle != null) {
            this.f27621d = bundle.getString("SELECTED_IMPORTER_NAME_VALUE");
            this.f27622e = (Uri) bundle.getParcelable("SELECTED_DOCUMENT_URI_VALUE");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @SuppressLint
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        Window window;
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext(), C2507R.style.DialogTheme);
        FragmentActivity activity = getActivity();
        View view = null;
        LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(C2507R.layout.dialog_bookmarks_import, (ViewGroup) null);
            if (Intrinsics.m32174c(this.f27621d, "Shikimori")) {
                CustomRadioGroup customRadioGroup = (CustomRadioGroup) inflate.findViewById(C2507R.id.container_custom);
                TwoFieldsRadioButton twoFieldsRadioButton = (TwoFieldsRadioButton) inflate.findViewById(C2507R.id.itemShikimori);
                Intrinsics.m32178g(twoFieldsRadioButton, "view.itemShikimori");
                customRadioGroup.setSelectedButtonToSelectedState(twoFieldsRadioButton);
                ((TextView) inflate.findViewById(C2507R.id.import_drop_file_hint)).setText(C2507R.string.import_drop_file_hint_shikimori);
                TextView textView = (TextView) inflate.findViewById(C2507R.id.import_drop_file_hint);
                Intrinsics.m32178g(textView, "view.import_drop_file_hint");
                ViewsKt.m16380m(textView, true);
            }
            ((CustomRadioGroup) inflate.findViewById(C2507R.id.container_custom)).setOnRadioClickListener(this);
            if (this.f27621d != null && this.f27622e != null) {
                m15413c4();
            }
            Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                view = window.getDecorView();
            }
            m15416n4(view);
            TextView textView2 = (TextView) inflate.findViewById(C2507R.id.choose);
            Intrinsics.m32178g(textView2, "view.choose");
            ViewsKt.m16377j(textView2, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.dialog.BookmarksImportFragment$onCreateDialog$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(View view2) {
                    View it = view2;
                    Intrinsics.m32179h(it, "it");
                    BookmarksImportFragment bookmarksImportFragment = BookmarksImportFragment.this;
                    if (bookmarksImportFragment.f27621d == null) {
                        bookmarksImportFragment.m15415m4();
                    } else {
                        bookmarksImportFragment.onChooseJson();
                    }
                    return Unit.f63088a;
                }
            });
            ((MaterialButton) inflate.findViewById(C2507R.id.btnContinue)).setOnClickListener(new ViewOnClickListenerC2625a(this, 2));
            builder.setView(inflate);
        }
        AlertDialog create = builder.create();
        Intrinsics.m32178g(create, "alertDialogBuilder.create()");
        return create;
    }

    @Override // com.swiftsoft.anixartd.p015ui.dialog.BaseDialogFragment, moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f27625h.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i2, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.m32179h(permissions, "permissions");
        Intrinsics.m32179h(grantResults, "grantResults");
        super.onRequestPermissionsResult(i2, permissions, grantResults);
        EasyPermissions.m34990b(i2, permissions, grantResults, this);
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.m32179h(outState, "outState");
        outState.putString("SELECTED_IMPORTER_NAME_VALUE", this.f27621d);
        outState.putParcelable("SELECTED_DOCUMENT_URI_VALUE", this.f27622e);
        super.onSaveInstanceState(outState);
    }
}
