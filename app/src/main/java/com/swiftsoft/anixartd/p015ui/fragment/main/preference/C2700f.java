package com.swiftsoft.anixartd.p015ui.fragment.main.preference;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.documentfile.provider.DocumentFile;
import androidx.preference.Preference;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.dialog.BookmarksExportFragment;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.Time;
import com.yandex.metrica.YandexMetrica;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.ui.fragment.main.preference.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2700f implements Preference.OnPreferenceClickListener, ActivityResultCallback {

    /* renamed from: b */
    public final /* synthetic */ int f28403b;

    /* renamed from: c */
    public final /* synthetic */ DataPreferenceFragment f28404c;

    public /* synthetic */ C2700f(DataPreferenceFragment dataPreferenceFragment, int i2) {
        this.f28403b = i2;
        this.f28404c = dataPreferenceFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.result.ActivityResultCallback
    /* renamed from: a */
    public void mo314a(Object obj) {
        Uri data;
        String str;
        final DataPreferenceFragment this$0 = this.f28404c;
        ActivityResult activityResult = (ActivityResult) obj;
        KProperty<Object>[] kPropertyArr = DataPreferenceFragment.f28316t;
        Intrinsics.m32179h(this$0, "this$0");
        if (activityResult.f239b == -1) {
            Context requireContext = this$0.requireContext();
            Intrinsics.m32178g(requireContext, "requireContext()");
            Intent intent = activityResult.f240c;
            if (intent == null || (data = intent.getData()) == null) {
                this$0.m15531m4();
                return;
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.f63351b = "text/plain";
            Integer num = this$0.m15530e4().f26527c.f29076b;
            if (num != null && num.intValue() == 0) {
                objectRef.f63351b = "text/csv";
                str = "csv";
            } else {
                str = "txt";
            }
            final DocumentFile mo2750a = DocumentFile.m2749c(requireContext, data).mo2750a((String) objectRef.f63351b, "Anixart_Bookmarks_" + Time.f30247a.m16356b(System.currentTimeMillis() / 1000, "dd.MM.yyyy") + '.' + str);
            if (mo2750a == null) {
                this$0.m15531m4();
                return;
            }
            OutputStream openOutputStream = requireContext.getContentResolver().openOutputStream(mo2750a.mo2751d());
            if (openOutputStream == null) {
                this$0.m15531m4();
                return;
            }
            String str2 = this$0.m15530e4().f26527c.f29077c;
            if (str2 == null) {
                str2 = this$0.getString(C2507R.string.something_went_wrong);
                Intrinsics.m32178g(str2, "getString(R.string.something_went_wrong)");
            }
            openOutputStream.write(this$0.f28318o);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openOutputStream, Charset.forName("UTF-8").newEncoder());
            outputStreamWriter.write(str2);
            outputStreamWriter.flush();
            openOutputStream.flush();
            openOutputStream.close();
            Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(requireContext);
            builder.f30150b = 3;
            builder.m16318j(C2507R.string.export_success);
            String string = this$0.getString(C2507R.string.export_success_summary);
            Intrinsics.m32178g(string, "getString(R.string.export_success_summary)");
            builder.m16310b(string);
            String string2 = this$0.getString(C2507R.string.export_open_file);
            Intrinsics.m32178g(string2, "getString(R.string.export_open_file)");
            builder.m16316h(string2);
            builder.m16311c(C2507R.string.export_not_open);
            builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.fragment.main.preference.DataPreferenceFragment$chooseFileListener$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                    Dialogs.MaterialDialog it = materialDialog;
                    Intrinsics.m32179h(it, "it");
                    Intent dataAndType = new Intent("android.intent.action.VIEW").addFlags(1).addFlags(268435456).setDataAndType(Uri.parse(DocumentFile.this.mo2751d().toString()), objectRef.f63351b);
                    Intrinsics.m32178g(dataAndType, "Intent(Intent.ACTION_VIE…oString()), fileMimeType)");
                    this$0.startActivity(dataAndType);
                    return Unit.f63088a;
                }
            });
            builder.f30159k = true;
            builder.m16317i();
        }
    }

    @Override // androidx.preference.Preference.OnPreferenceClickListener
    /* renamed from: c */
    public boolean mo3395c(Preference preference) {
        switch (this.f28403b) {
            case 0:
                DataPreferenceFragment this$0 = this.f28404c;
                KProperty<Object>[] kPropertyArr = DataPreferenceFragment.f28316t;
                Intrinsics.m32179h(this$0, "this$0");
                YandexMetrica.reportEvent("Переход в раздел Импорт закладок");
                this$0.m15530e4().m14747c();
                break;
            default:
                DataPreferenceFragment this$02 = this.f28404c;
                KProperty<Object>[] kPropertyArr2 = DataPreferenceFragment.f28316t;
                Intrinsics.m32179h(this$02, "this$0");
                YandexMetrica.reportEvent("Переход в раздел Экспорт закладок");
                new BookmarksExportFragment().show(this$02.getChildFragmentManager(), "BOOKMARKS_EXPORT_TAG");
                break;
        }
        return true;
    }
}
