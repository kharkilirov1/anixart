package com.swiftsoft.anixartd.utils.cropper;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.utils.cropper.CropImage;
import com.swiftsoft.anixartd.utils.cropper.CropImageView;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class CropImageActivity extends AppCompatActivity implements CropImageView.OnSetImageUriCompleteListener, CropImageView.OnCropImageCompleteListener {

    /* renamed from: b */
    public CropImageView f30304b;

    /* renamed from: c */
    public Uri f30305c;

    /* renamed from: d */
    public CropImageOptions f30306d;

    @Override // com.swiftsoft.anixartd.utils.cropper.CropImageView.OnSetImageUriCompleteListener
    /* renamed from: E2 */
    public void mo16409E2(CropImageView cropImageView, Uri uri, Exception exc) {
        if (exc != null) {
            m16411s4(null, exc, 1);
            return;
        }
        Rect rect = this.f30306d.f30331N;
        if (rect != null) {
            this.f30304b.setCropRect(rect);
        }
        int i2 = this.f30306d.f30332O;
        if (i2 > -1) {
            this.f30304b.setRotatedDegrees(i2);
        }
    }

    @Override // com.swiftsoft.anixartd.utils.cropper.CropImageView.OnCropImageCompleteListener
    /* renamed from: k2 */
    public void mo16410k2(CropImageView cropImageView, CropImageView.CropResult cropResult) {
        m16411s4(cropResult.f30407c, cropResult.f30408d, cropResult.f30413i);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @SuppressLint
    public void onActivityResult(int i2, int i3, Intent intent) {
        String action;
        if (i2 == 200) {
            if (i3 == 0) {
                m16412t4();
            }
            if (i3 == -1) {
                boolean z = true;
                if (intent != null && intent.getData() != null && ((action = intent.getAction()) == null || !action.equals("android.media.action.IMAGE_CAPTURE"))) {
                    z = false;
                }
                Uri m16403a = (z || intent.getData() == null) ? CropImage.m16403a(this) : intent.getData();
                this.f30305c = m16403a;
                if (CropImage.m16406d(this, m16403a)) {
                    requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
                } else {
                    this.f30304b.setImageUriAsync(this.f30305c);
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        m16412t4();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint
    public void onCreate(Bundle bundle) {
        CharSequence charSequence;
        super.onCreate(bundle);
        setContentView(C2507R.layout.crop_image_activity);
        this.f30304b = (CropImageView) findViewById(C2507R.id.cropImageView);
        Bundle bundleExtra = getIntent().getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
        this.f30305c = (Uri) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_SOURCE");
        this.f30306d = (CropImageOptions) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        if (bundle == null) {
            Uri uri = this.f30305c;
            if (uri == null || uri.equals(Uri.EMPTY)) {
                if (CropImage.m16405c(this)) {
                    requestPermissions(new String[]{"android.permission.CAMERA"}, 2011);
                } else {
                    CropImage.m16407e(this);
                }
            } else if (CropImage.m16406d(this, this.f30305c)) {
                requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
            } else {
                this.f30304b.setImageUriAsync(this.f30305c);
            }
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            CropImageOptions cropImageOptions = this.f30306d;
            supportActionBar.mo345x((cropImageOptions == null || (charSequence = cropImageOptions.f30322E) == null || charSequence.length() <= 0) ? getResources().getString(C2507R.string.crop_image_activity_title) : this.f30306d.f30322E);
            supportActionBar.mo341t(true);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C2507R.menu.crop_image_menu, menu);
        CropImageOptions cropImageOptions = this.f30306d;
        if (!cropImageOptions.f30333P) {
            menu.removeItem(C2507R.id.crop_image_menu_rotate_left);
            menu.removeItem(C2507R.id.crop_image_menu_rotate_right);
        } else if (cropImageOptions.f30335R) {
            menu.findItem(C2507R.id.crop_image_menu_rotate_left).setVisible(true);
        }
        if (!this.f30306d.f30334Q) {
            menu.removeItem(C2507R.id.crop_image_menu_flip);
        }
        if (this.f30306d.f30339V != null) {
            menu.findItem(C2507R.id.crop_image_menu_crop).setTitle(this.f30306d.f30339V);
        }
        Drawable drawable = null;
        try {
            int i2 = this.f30306d.f30340W;
            if (i2 != 0) {
                drawable = ContextCompat.m1671d(this, i2);
                menu.findItem(C2507R.id.crop_image_menu_crop).setIcon(drawable);
            }
        } catch (Exception e2) {
            Log.w("AIC", "Failed to read menu crop drawable", e2);
        }
        int i3 = this.f30306d.f30323F;
        if (i3 != 0) {
            m16413u4(menu, C2507R.id.crop_image_menu_rotate_left, i3);
            m16413u4(menu, C2507R.id.crop_image_menu_rotate_right, this.f30306d.f30323F);
            m16413u4(menu, C2507R.id.crop_image_menu_flip, this.f30306d.f30323F);
            if (drawable != null) {
                m16413u4(menu, C2507R.id.crop_image_menu_crop, this.f30306d.f30323F);
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != C2507R.id.crop_image_menu_crop) {
            if (menuItem.getItemId() == C2507R.id.crop_image_menu_rotate_left) {
                this.f30304b.m16419e(-this.f30306d.f30336S);
                return true;
            }
            if (menuItem.getItemId() == C2507R.id.crop_image_menu_rotate_right) {
                this.f30304b.m16419e(this.f30306d.f30336S);
                return true;
            }
            if (menuItem.getItemId() == C2507R.id.crop_image_menu_flip_horizontally) {
                CropImageView cropImageView = this.f30304b;
                cropImageView.f30391m = !cropImageView.f30391m;
                cropImageView.m16415a(cropImageView.getWidth(), cropImageView.getHeight(), true, false);
                return true;
            }
            if (menuItem.getItemId() == C2507R.id.crop_image_menu_flip_vertically) {
                CropImageView cropImageView2 = this.f30304b;
                cropImageView2.f30392n = !cropImageView2.f30392n;
                cropImageView2.m16415a(cropImageView2.getWidth(), cropImageView2.getHeight(), true, false);
                return true;
            }
            if (menuItem.getItemId() != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            m16412t4();
            return true;
        }
        CropImageOptions cropImageOptions = this.f30306d;
        if (cropImageOptions.f30330M) {
            m16411s4(null, null, 1);
        } else {
            Uri uri = cropImageOptions.f30324G;
            if (uri == null || uri.equals(Uri.EMPTY)) {
                try {
                    Bitmap.CompressFormat compressFormat = this.f30306d.f30325H;
                    uri = Uri.fromFile(File.createTempFile("cropped", compressFormat == Bitmap.CompressFormat.JPEG ? ".jpg" : compressFormat == Bitmap.CompressFormat.PNG ? ".png" : ".webp", getCacheDir()));
                } catch (IOException e2) {
                    throw new RuntimeException("Failed to create temp file for output image", e2);
                }
            }
            Uri uri2 = uri;
            CropImageView cropImageView3 = this.f30304b;
            CropImageOptions cropImageOptions2 = this.f30306d;
            Bitmap.CompressFormat compressFormat2 = cropImageOptions2.f30325H;
            int i2 = cropImageOptions2.f30326I;
            int i3 = cropImageOptions2.f30327J;
            int i4 = cropImageOptions2.f30328K;
            CropImageView.RequestSizeOptions requestSizeOptions = cropImageOptions2.f30329L;
            if (cropImageView3.f30368B == null) {
                throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
            }
            cropImageView3.m16423i(i3, i4, requestSizeOptions, uri2, compressFormat2, i2);
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i2 == 201) {
            Uri uri = this.f30305c;
            if (uri == null || iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(this, C2507R.string.crop_image_activity_no_permissions, 1).show();
                m16412t4();
            } else {
                this.f30304b.setImageUriAsync(uri);
            }
        }
        if (i2 == 2011) {
            CropImage.m16407e(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f30304b.setOnSetImageUriCompleteListener(this);
        this.f30304b.setOnCropImageCompleteListener(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f30304b.setOnSetImageUriCompleteListener(null);
        this.f30304b.setOnCropImageCompleteListener(null);
    }

    /* renamed from: s4 */
    public void m16411s4(Uri uri, Exception exc, int i2) {
        int i3 = exc == null ? -1 : 204;
        CropImage.ActivityResult activityResult = new CropImage.ActivityResult(this.f30304b.getImageUri(), uri, exc, this.f30304b.getCropPoints(), this.f30304b.getCropRect(), this.f30304b.getRotatedDegrees(), this.f30304b.getWholeImageRect(), i2);
        Intent intent = new Intent();
        intent.putExtras(getIntent());
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", activityResult);
        setResult(i3, intent);
        finish();
    }

    /* renamed from: t4 */
    public void m16412t4() {
        setResult(0);
        finish();
    }

    /* renamed from: u4 */
    public final void m16413u4(Menu menu, int i2, int i3) {
        Drawable icon;
        MenuItem findItem = menu.findItem(i2);
        if (findItem == null || (icon = findItem.getIcon()) == null) {
            return;
        }
        try {
            icon.mutate();
            icon.setColorFilter(i3, PorterDuff.Mode.SRC_ATOP);
            findItem.setIcon(icon);
        } catch (Exception e2) {
            Log.w("AIC", "Failed to update menu item color", e2);
        }
    }
}
