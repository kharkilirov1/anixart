package pub.devrel.easypermissions;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.swiftsoft.anixartd.C2507R;
import p000a.C0000a;
import pub.devrel.easypermissions.AppSettingsDialog;

@RestrictTo
/* loaded from: classes3.dex */
public class AppSettingsDialogHolderActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

    /* renamed from: b */
    public AlertDialog f69373b;

    /* renamed from: c */
    public int f69374c;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        setResult(i3, intent);
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null));
            data.addFlags(this.f69374c);
            startActivityForResult(data, 7534);
        } else {
            if (i2 != -2) {
                throw new IllegalStateException(C0000a.m7d("Unknown button type: ", i2));
            }
            setResult(0);
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        AppSettingsDialog appSettingsDialog = (AppSettingsDialog) intent.getParcelableExtra("extra_app_settings");
        if (appSettingsDialog == null) {
            Log.e("EasyPermissions", "Intent contains null value for EXTRA_APP_SETTINGS: intent=" + intent + ", extras=" + intent.getExtras());
            AppSettingsDialog.Builder builder = new AppSettingsDialog.Builder(this);
            builder.f69368c = TextUtils.isEmpty(builder.f69368c) ? getString(C2507R.string.rationale_ask_again) : builder.f69368c;
            builder.f69369d = TextUtils.isEmpty(builder.f69369d) ? getString(C2507R.string.title_settings_dialog) : builder.f69369d;
            builder.f69370e = TextUtils.isEmpty(builder.f69370e) ? getString(android.R.string.ok) : builder.f69370e;
            String string = TextUtils.isEmpty(builder.f69371f) ? getString(android.R.string.cancel) : builder.f69371f;
            builder.f69371f = string;
            int i2 = builder.f69372g;
            int i3 = i2 > 0 ? i2 : 16061;
            builder.f69372g = i3;
            appSettingsDialog = new AppSettingsDialog(this, -1, builder.f69368c, builder.f69369d, builder.f69370e, string, i3, 0, null);
        }
        appSettingsDialog.m34988a(this);
        this.f69374c = appSettingsDialog.f69363h;
        int i4 = appSettingsDialog.f69357b;
        this.f69373b = (i4 != -1 ? new AlertDialog.Builder(appSettingsDialog.f69365j, i4) : new AlertDialog.Builder(appSettingsDialog.f69365j)).mo367a(false).setTitle(appSettingsDialog.f69359d).mo369c(appSettingsDialog.f69358c).mo375i(appSettingsDialog.f69360e, this).mo371e(appSettingsDialog.f69361f, this).m378l();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AlertDialog alertDialog = this.f69373b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.f69373b.dismiss();
    }
}
