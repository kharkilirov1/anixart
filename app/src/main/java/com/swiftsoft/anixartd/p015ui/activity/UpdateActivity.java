package com.swiftsoft.anixartd.p015ui.activity;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.Html;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.RunnableC0042c;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.FileProvider;
import com.airbnb.lottie.LottieAnimationView;
import com.google.firebase.auth.C2052a;
import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.BuildConfig;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.presentation.main.update.UpdatePresenter;
import com.swiftsoft.anixartd.presentation.main.update.UpdateView;
import com.swiftsoft.anixartd.utils.Dialogs;
import com.swiftsoft.anixartd.utils.ViewsKt;
import com.yandex.metrica.YandexMetrica;
import com.yandex.mobile.ads.C4632R;
import dagger.Lazy;
import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import moxy.MvpAppCompatActivity;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import okhttp3.internal.p038ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;
import pub.devrel.easypermissions.EasyPermissions;
import pub.devrel.easypermissions.PermissionRequest;

/* compiled from: UpdateActivity.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/UpdateActivity;", "Lmoxy/MvpAppCompatActivity;", "Lcom/swiftsoft/anixartd/presentation/main/update/UpdateView;", "<init>", "()V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class UpdateActivity extends MvpAppCompatActivity implements UpdateView {

    /* renamed from: h */
    public static final /* synthetic */ KProperty<Object>[] f27474h = {C2052a.m12277l(UpdateActivity.class, "presenter", "getPresenter()Lcom/swiftsoft/anixartd/presentation/main/update/UpdatePresenter;", 0)};

    /* renamed from: i */
    @NotNull
    public static final String[] f27475i = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* renamed from: e */
    @Inject
    public Lazy<UpdatePresenter> f27479e;

    /* renamed from: f */
    @NotNull
    public final MoxyKtxDelegate f27480f;

    /* renamed from: g */
    @NotNull
    public Map<Integer, View> f27481g = new LinkedHashMap();

    /* renamed from: b */
    @NotNull
    public String f27476b = "";

    /* renamed from: c */
    @NotNull
    public String f27477c = "";

    /* renamed from: d */
    @NotNull
    public BroadcastReceiver f27478d = new BroadcastReceiver() { // from class: com.swiftsoft.anixartd.ui.activity.UpdateActivity$attachmentDownloadCompleteReceive$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            Intrinsics.m32179h(context, "context");
            Intrinsics.m32179h(intent, "intent");
            if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
                long longExtra = intent.getLongExtra("extra_download_id", 0L);
                UpdateActivity updateActivity = UpdateActivity.this;
                KProperty<Object>[] kPropertyArr = UpdateActivity.f27474h;
                Objects.requireNonNull(updateActivity);
                try {
                    Object systemService = updateActivity.getSystemService("download");
                    Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                    DownloadManager.Query query = new DownloadManager.Query();
                    boolean z = true;
                    query.setFilterById(longExtra);
                    Cursor query2 = ((DownloadManager) systemService).query(query);
                    if (query2.moveToFirst()) {
                        int i2 = query2.getInt(query2.getColumnIndex("status"));
                        String string = query2.getString(query2.getColumnIndex("local_uri"));
                        Intrinsics.m32178g(string, "cursor.getString(cursor.…anager.COLUMN_LOCAL_URI))");
                        String string2 = query2.getString(query2.getColumnIndex("media_type"));
                        Intrinsics.m32178g(string2, "cursor.getString(cursor.…nager.COLUMN_MEDIA_TYPE))");
                        if (i2 == 8) {
                            if (string.length() != 0) {
                                z = false;
                            }
                            if (!z) {
                                updateActivity.m15341w4(new File(Uri.parse(string).getPath()), string2);
                            }
                        }
                    }
                    query2.close();
                } catch (Exception unused) {
                    updateActivity.m15338t4();
                }
            }
        }
    };

    /* compiled from: UpdateActivity.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lcom/swiftsoft/anixartd/ui/activity/UpdateActivity$Companion;", "", "", "RC_STORAGE", "I", "", "", "STORAGE", "[Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public UpdateActivity() {
        Function0<UpdatePresenter> function0 = new Function0<UpdatePresenter>() { // from class: com.swiftsoft.anixartd.ui.activity.UpdateActivity$presenter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public UpdatePresenter invoke() {
                Lazy<UpdatePresenter> lazy = UpdateActivity.this.f27479e;
                if (lazy != null) {
                    return lazy.get();
                }
                Intrinsics.m32189r("presenterProvider");
                throw null;
            }
        };
        MvpDelegate mvpDelegate = getMvpDelegate();
        this.f27480f = new MoxyKtxDelegate(mvpDelegate, C2052a.m12274i(UpdatePresenter.class, C2052a.m12275j(mvpDelegate, "mvpDelegate"), ".", "presenter"), function0);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.update.UpdateView
    /* renamed from: a */
    public void mo15251a() {
        ProgressBar progress_bar = (ProgressBar) m15337s4(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16372e(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.update.UpdateView
    /* renamed from: b */
    public void mo15252b() {
        ProgressBar progress_bar = (ProgressBar) m15337s4(C2507R.id.progress_bar);
        Intrinsics.m32178g(progress_bar, "progress_bar");
        ViewsKt.m16378k(progress_bar);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.update.UpdateView
    /* renamed from: c */
    public void mo15253c() {
        RelativeLayout container = (RelativeLayout) m15337s4(C2507R.id.container);
        Intrinsics.m32178g(container, "container");
        ViewsKt.m16372e(container);
        LinearLayout error_layout = (LinearLayout) m15337s4(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16378k(error_layout);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.update.UpdateView
    /* renamed from: g4 */
    public void mo15254g4(final boolean z, int i2, int i3, @NotNull String whatsNew, @NotNull final String downloadLink) {
        Intrinsics.m32179h(whatsNew, "whatsNew");
        Intrinsics.m32179h(downloadLink, "downloadLink");
        this.f27476b = downloadLink;
        this.f27477c = C0000a.m8e("Anixart_", i3, ".apk");
        new Handler().postDelayed(new RunnableC0042c(this, 7), 2000L);
        LottieAnimationView logo = (LottieAnimationView) m15337s4(C2507R.id.logo);
        Intrinsics.m32178g(logo, "logo");
        ViewsKt.m16377j(logo, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.UpdateActivity$onUpdate$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                ((LottieAnimationView) UpdateActivity.this.m15337s4(C2507R.id.logo)).m4644k();
                return Unit.f63088a;
            }
        });
        if (24111318 < i2) {
            ((TextView) m15337s4(C2507R.id.text)).setText(getString(C2507R.string.update_required));
            ((TextView) m15337s4(C2507R.id.message)).setText(getString(C2507R.string.update_required_desc));
        } else if (24111318 < i3) {
            ((TextView) m15337s4(C2507R.id.text)).setText(getString(C2507R.string.update_available));
            ((TextView) m15337s4(C2507R.id.message)).setText(getString(C2507R.string.update_available_desc));
        } else if (24111318 >= i3) {
            ((TextView) m15337s4(C2507R.id.text)).setText(getString(C2507R.string.app_updated));
            ((TextView) m15337s4(C2507R.id.message)).setText(getString(C2507R.string.app_updated_desc));
            LinearLayout updatePanel = (LinearLayout) m15337s4(C2507R.id.updatePanel);
            Intrinsics.m32178g(updatePanel, "updatePanel");
            ViewsKt.m16372e(updatePanel);
            TextView version = (TextView) m15337s4(C2507R.id.version);
            Intrinsics.m32178g(version, "version");
            ViewsKt.m16378k(version);
            LinearLayout whatsnew_layout = (LinearLayout) m15337s4(C2507R.id.whatsnew_layout);
            Intrinsics.m32178g(whatsnew_layout, "whatsnew_layout");
            ViewsKt.m16372e(whatsnew_layout);
        }
        ((TextView) m15337s4(C2507R.id.whatsnew)).setText(Html.fromHtml(whatsNew));
        ((TextView) m15337s4(C2507R.id.version)).setText("Версия 8.2.3 Сборка 24111318");
        RelativeLayout update = (RelativeLayout) m15337s4(C2507R.id.update);
        Intrinsics.m32178g(update, "update");
        ViewsKt.m16377j(update, new Function1<View, Unit>(z, downloadLink, this) { // from class: com.swiftsoft.anixartd.ui.activity.UpdateActivity$onUpdate$3

            /* renamed from: b */
            public final /* synthetic */ UpdateActivity f27486b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f27486b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                int i4 = BuildConfig.f25343a;
                UpdateActivity updateActivity = this.f27486b;
                String[] strArr = UpdateActivity.f27475i;
                if (!EasyPermissions.m34989a(updateActivity, (String[]) Arrays.copyOf(strArr, strArr.length))) {
                    EasyPermissions.m34991c(new PermissionRequest.Builder(this.f27486b, C4632R.styleable.AppCompatTheme_windowMinWidthMajor, (String[]) Arrays.copyOf(strArr, strArr.length)).m34997a());
                } else if (Build.VERSION.SDK_INT < 26 || this.f27486b.getPackageManager().canRequestPackageInstalls()) {
                    RelativeLayout downloading = (RelativeLayout) this.f27486b.m15337s4(C2507R.id.downloading);
                    Intrinsics.m32178g(downloading, "downloading");
                    ViewsKt.m16378k(downloading);
                    RelativeLayout update2 = (RelativeLayout) this.f27486b.m15337s4(C2507R.id.update);
                    Intrinsics.m32178g(update2, "update");
                    ViewsKt.m16372e(update2);
                    this.f27486b.m15339u4();
                } else {
                    final UpdateActivity updateActivity2 = this.f27486b;
                    Objects.requireNonNull(updateActivity2);
                    Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(updateActivity2);
                    builder.f30150b = 2;
                    builder.m16318j(C2507R.string.attention);
                    String string = updateActivity2.getString(C2507R.string.update_request_unknown_source_permission);
                    Intrinsics.m32178g(string, "getString(R.string.updat…nknown_source_permission)");
                    builder.m16310b(string);
                    String string2 = updateActivity2.getString(C2507R.string.allow);
                    Intrinsics.m32178g(string2, "getString(R.string.allow)");
                    builder.m16316h(string2);
                    builder.m16311c(C2507R.string.cancel);
                    builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.UpdateActivity$requestUnknownSource$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                            Dialogs.MaterialDialog it2 = materialDialog;
                            Intrinsics.m32179h(it2, "it");
                            Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                            String format = String.format("package:%s", Arrays.copyOf(new Object[]{UpdateActivity.this.getPackageName()}, 1));
                            Intrinsics.m32178g(format, "format(format, *args)");
                            Intent data = intent.setData(Uri.parse(format));
                            Intrinsics.m32178g(data, "Intent(Settings.ACTION_M…eName))\n                )");
                            UpdateActivity.this.startActivityForResult(data, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
                            return Unit.f63088a;
                        }
                    });
                    builder.f30159k = true;
                    builder.m16317i();
                }
                return Unit.f63088a;
            }
        });
        ((TextView) m15337s4(C2507R.id.help)).setOnClickListener(new ViewOnClickListenerC2625a(this, 1));
        LinearLayout error_layout = (LinearLayout) m15337s4(C2507R.id.error_layout);
        Intrinsics.m32178g(error_layout, "error_layout");
        ViewsKt.m16372e(error_layout);
        RelativeLayout container = (RelativeLayout) m15337s4(C2507R.id.container);
        Intrinsics.m32178g(container, "container");
        ViewsKt.m16378k(container);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @RequiresApi
    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 != 1001) {
            m15338t4();
            return;
        }
        if (getPackageManager().canRequestPackageInstalls()) {
            RelativeLayout downloading = (RelativeLayout) m15337s4(C2507R.id.downloading);
            Intrinsics.m32178g(downloading, "downloading");
            ViewsKt.m16378k(downloading);
            RelativeLayout update = (RelativeLayout) m15337s4(C2507R.id.update);
            Intrinsics.m32178g(update, "update");
            ViewsKt.m16372e(update);
            m15339u4();
            return;
        }
        Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(this);
        builder.f30150b = 3;
        builder.m16318j(C2507R.string.attention);
        String string = getString(C2507R.string.update_unknown_source_permission_not_granted);
        Intrinsics.m32178g(string, "getString(R.string.updat…e_permission_not_granted)");
        builder.m16310b(string);
        builder.m16315g(C2507R.string.allow);
        builder.m16311c(C2507R.string.download);
        builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.UpdateActivity$unknownSourceNotGranted$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                Intent intent2 = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
                String format = String.format("package:%s", Arrays.copyOf(new Object[]{UpdateActivity.this.getPackageName()}, 1));
                Intrinsics.m32178g(format, "format(format, *args)");
                Intent data = intent2.setData(Uri.parse(format));
                Intrinsics.m32178g(data, "Intent(Settings.ACTION_M…eName))\n                )");
                UpdateActivity.this.startActivityForResult(data, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY);
                return Unit.f63088a;
            }
        });
        builder.m16313e(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.UpdateActivity$unknownSourceNotGranted$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                YandexMetrica.reportEvent("Скачивание обновления");
                UpdateActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(UpdateActivity.this.f27476b)));
                return Unit.f63088a;
            }
        });
        builder.f30159k = true;
        builder.m16317i();
    }

    @Override // moxy.MvpAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        App.f25340b.m14043a().mo14148s0(this);
        super.onCreate(bundle);
        setContentView(C2507R.layout.activity_update);
        AppCompatButton repeat = (AppCompatButton) m15337s4(C2507R.id.repeat);
        Intrinsics.m32178g(repeat, "repeat");
        ViewsKt.m16377j(repeat, new Function1<View, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.UpdateActivity$onCreate$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(View view) {
                View it = view;
                Intrinsics.m32179h(it, "it");
                LinearLayout error_layout = (LinearLayout) UpdateActivity.this.m15337s4(C2507R.id.error_layout);
                Intrinsics.m32178g(error_layout, "error_layout");
                ViewsKt.m16372e(error_layout);
                UpdateActivity.this.m15340v4().m15250a();
                return Unit.f63088a;
            }
        });
        m15340v4().m15250a();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.m32179h(permissions, "permissions");
        Intrinsics.m32179h(grantResults, "grantResults");
        super.onRequestPermissionsResult(i2, permissions, grantResults);
        EasyPermissions.m34990b(i2, permissions, grantResults, this);
    }

    @Nullable
    /* renamed from: s4 */
    public View m15337s4(int i2) {
        Map<Integer, View> map = this.f27481g;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* renamed from: t4 */
    public final void m15338t4() {
        RelativeLayout update = (RelativeLayout) m15337s4(C2507R.id.update);
        Intrinsics.m32178g(update, "update");
        ViewsKt.m16378k(update);
        RelativeLayout downloading = (RelativeLayout) m15337s4(C2507R.id.downloading);
        Intrinsics.m32178g(downloading, "downloading");
        ViewsKt.m16372e(downloading);
        Dialogs.MaterialDialog.Builder builder = new Dialogs.MaterialDialog.Builder(this);
        builder.f30150b = 3;
        builder.m16318j(C2507R.string.error);
        String string = getString(C2507R.string.update_download_failed);
        Intrinsics.m32178g(string, "getString(R.string.update_download_failed)");
        builder.m16310b(string);
        String string2 = getString(C2507R.string.download);
        Intrinsics.m32178g(string2, "getString(R.string.download)");
        builder.m16316h(string2);
        builder.m16311c(C2507R.string.cancel);
        builder.m16314f(new Function1<Dialogs.MaterialDialog, Unit>() { // from class: com.swiftsoft.anixartd.ui.activity.UpdateActivity$downloadFailed$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Dialogs.MaterialDialog materialDialog) {
                Dialogs.MaterialDialog it = materialDialog;
                Intrinsics.m32179h(it, "it");
                YandexMetrica.reportEvent("Скачивание обновления");
                UpdateActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(UpdateActivity.this.f27476b)));
                return Unit.f63088a;
            }
        });
        builder.f30159k = true;
        builder.m16317i();
    }

    /* renamed from: u4 */
    public final void m15339u4() {
        try {
            if (this.f27476b.length() > 0) {
                Uri parse = Uri.parse(this.f27476b);
                registerReceiver(this.f27478d, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
                String uri = parse.toString();
                Intrinsics.m32178g(uri, "uri.toString()");
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri);
                if (!Intrinsics.m32174c(fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : null, "application/vnd.android.package-archive")) {
                    m15338t4();
                    return;
                }
                DownloadManager.Request request = new DownloadManager.Request(parse);
                String uri2 = parse.toString();
                Intrinsics.m32178g(uri2, "uri.toString()");
                String fileExtensionFromUrl2 = MimeTypeMap.getFileExtensionFromUrl(uri2);
                request.setMimeType(fileExtensionFromUrl2 != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl2) : null);
                request.setTitle("Обновление Anixart");
                request.setDescription(this.f27477c);
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, this.f27477c);
                Object systemService = getSystemService("download");
                Intrinsics.m32177f(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
                ((DownloadManager) systemService).enqueue(request);
                YandexMetrica.reportEvent("Скачивание обновления");
            }
        } catch (Exception unused) {
            m15338t4();
        }
    }

    /* renamed from: v4 */
    public final UpdatePresenter m15340v4() {
        return (UpdatePresenter) this.f27480f.getValue(this, f27474h[0]);
    }

    /* renamed from: w4 */
    public final void m15341w4(File file, String str) {
        Uri fromFile;
        try {
            RelativeLayout update = (RelativeLayout) m15337s4(C2507R.id.update);
            Intrinsics.m32178g(update, "update");
            update.setVisibility(0);
            RelativeLayout downloading = (RelativeLayout) m15337s4(C2507R.id.downloading);
            Intrinsics.m32178g(downloading, "downloading");
            ViewsKt.m16372e(downloading);
            if (Build.VERSION.SDK_INT >= 24) {
                fromFile = FileProvider.m1696b(this, getPackageName() + ".provider", file);
            } else {
                fromFile = Uri.fromFile(file);
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(fromFile, str);
            intent.setFlags(268435456);
            intent.addFlags(1);
            intent.setAction("android.intent.action.VIEW");
            startActivity(intent);
        } catch (Exception unused) {
            m15338t4();
        }
    }
}
