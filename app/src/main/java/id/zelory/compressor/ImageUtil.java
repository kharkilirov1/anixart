package id.zelory.compressor;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import java.io.File;
import java.io.IOException;

/* loaded from: classes3.dex */
class ImageUtil {
    /* renamed from: a */
    public static Bitmap m30796a(File file, int i2, int i3) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i4 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        int i5 = options.outHeight;
        int i6 = options.outWidth;
        if (i5 > i3 || i6 > i2) {
            int i7 = i5 / 2;
            int i8 = i6 / 2;
            while (i7 / i4 >= i3 && i8 / i4 >= i2) {
                i4 *= 2;
            }
        }
        options.inSampleSize = i4;
        options.inJustDecodeBounds = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        int attributeInt = new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0);
        Matrix matrix = new Matrix();
        if (attributeInt == 6) {
            matrix.postRotate(90.0f);
        } else if (attributeInt == 3) {
            matrix.postRotate(180.0f);
        } else if (attributeInt == 8) {
            matrix.postRotate(270.0f);
        }
        return Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
    }
}
