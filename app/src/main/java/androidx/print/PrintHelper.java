package androidx.print;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class PrintHelper {

    /* renamed from: a */
    public static final boolean f5147a;

    /* renamed from: b */
    public static final boolean f5148b;

    /* renamed from: androidx.print.PrintHelper$1 */
    class AsyncTaskC04921 extends AsyncTask<Void, Void, Throwable> {

        /* renamed from: a */
        public final /* synthetic */ CancellationSignal f5149a;

        /* renamed from: b */
        public final /* synthetic */ PrintAttributes f5150b;

        /* renamed from: c */
        public final /* synthetic */ Bitmap f5151c;

        /* renamed from: d */
        public final /* synthetic */ PrintAttributes f5152d;

        /* renamed from: e */
        public final /* synthetic */ int f5153e;

        /* renamed from: f */
        public final /* synthetic */ ParcelFileDescriptor f5154f;

        /* renamed from: g */
        public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f5155g;

        /* renamed from: h */
        public final /* synthetic */ PrintHelper f5156h;

        @Override // android.os.AsyncTask
        public Throwable doInBackground(Void[] voidArr) {
            RectF rectF;
            try {
                if (this.f5149a.isCanceled()) {
                    return null;
                }
                Objects.requireNonNull(this.f5156h);
                PrintedPdfDocument printedPdfDocument = new PrintedPdfDocument(null, this.f5150b);
                Bitmap m3466a = PrintHelper.m3466a(this.f5151c, this.f5150b.getColorMode());
                if (this.f5149a.isCanceled()) {
                    return null;
                }
                try {
                    PdfDocument.Page startPage = printedPdfDocument.startPage(1);
                    boolean z = PrintHelper.f5148b;
                    if (z) {
                        rectF = new RectF(startPage.getInfo().getContentRect());
                    } else {
                        Objects.requireNonNull(this.f5156h);
                        PrintedPdfDocument printedPdfDocument2 = new PrintedPdfDocument(null, this.f5152d);
                        PdfDocument.Page startPage2 = printedPdfDocument2.startPage(1);
                        RectF rectF2 = new RectF(startPage2.getInfo().getContentRect());
                        printedPdfDocument2.finishPage(startPage2);
                        printedPdfDocument2.close();
                        rectF = rectF2;
                    }
                    int width = m3466a.getWidth();
                    int height = m3466a.getHeight();
                    int i2 = this.f5153e;
                    Matrix matrix = new Matrix();
                    float f2 = width;
                    float width2 = rectF.width() / f2;
                    float max = i2 == 2 ? Math.max(width2, rectF.height() / height) : Math.min(width2, rectF.height() / height);
                    matrix.postScale(max, max);
                    matrix.postTranslate((rectF.width() - (f2 * max)) / 2.0f, (rectF.height() - (height * max)) / 2.0f);
                    if (!z) {
                        matrix.postTranslate(rectF.left, rectF.top);
                        startPage.getCanvas().clipRect(rectF);
                    }
                    startPage.getCanvas().drawBitmap(m3466a, matrix, null);
                    printedPdfDocument.finishPage(startPage);
                    if (this.f5149a.isCanceled()) {
                        printedPdfDocument.close();
                        ParcelFileDescriptor parcelFileDescriptor = this.f5154f;
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                            } catch (IOException unused) {
                            }
                        }
                        if (m3466a == this.f5151c) {
                            return null;
                        }
                    } else {
                        printedPdfDocument.writeTo(new FileOutputStream(this.f5154f.getFileDescriptor()));
                        printedPdfDocument.close();
                        ParcelFileDescriptor parcelFileDescriptor2 = this.f5154f;
                        if (parcelFileDescriptor2 != null) {
                            try {
                                parcelFileDescriptor2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (m3466a == this.f5151c) {
                            return null;
                        }
                    }
                    m3466a.recycle();
                    return null;
                } finally {
                }
            } catch (Throwable th) {
                return th;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Throwable th) {
            Throwable th2 = th;
            if (this.f5149a.isCanceled()) {
                this.f5155g.onWriteCancelled();
            } else if (th2 == null) {
                this.f5155g.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
            } else {
                Log.e("PrintHelper", "Error writing printed content", th2);
                this.f5155g.onWriteFailed(null);
            }
        }
    }

    public interface OnPrintFinishCallback {
    }

    @RequiresApi
    public class PrintBitmapAdapter extends PrintDocumentAdapter {
        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(null).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            throw null;
        }
    }

    @RequiresApi
    public class PrintUriAdapter extends PrintDocumentAdapter {

        /* renamed from: a */
        public PrintAttributes f5157a;

        /* renamed from: b */
        public Bitmap f5158b;

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(final PrintAttributes printAttributes, final PrintAttributes printAttributes2, final CancellationSignal cancellationSignal, final PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
            synchronized (this) {
                this.f5157a = printAttributes2;
            }
            if (cancellationSignal.isCanceled()) {
                layoutResultCallback.onLayoutCancelled();
            } else if (this.f5158b != null) {
                layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(null).setContentType(1).setPageCount(1).build(), !printAttributes2.equals(printAttributes));
            } else {
                new AsyncTask<Uri, Boolean, Bitmap>() { // from class: androidx.print.PrintHelper.PrintUriAdapter.1
                    @Override // android.os.AsyncTask
                    public Bitmap doInBackground(Uri[] uriArr) {
                        try {
                            Objects.requireNonNull(PrintUriAdapter.this);
                            Objects.requireNonNull(PrintUriAdapter.this);
                            throw null;
                        } catch (FileNotFoundException unused) {
                            return null;
                        }
                    }

                    @Override // android.os.AsyncTask
                    public void onCancelled(Bitmap bitmap) {
                        layoutResultCallback.onLayoutCancelled();
                        Objects.requireNonNull(PrintUriAdapter.this);
                    }

                    @Override // android.os.AsyncTask
                    public void onPostExecute(Bitmap bitmap) {
                        PrintAttributes.MediaSize mediaSize;
                        Bitmap bitmap2 = bitmap;
                        super.onPostExecute(bitmap2);
                        if (bitmap2 != null) {
                            if (PrintHelper.f5147a) {
                                Objects.requireNonNull(PrintUriAdapter.this);
                                Objects.requireNonNull(null);
                                throw null;
                            }
                            synchronized (this) {
                                mediaSize = PrintUriAdapter.this.f5157a.getMediaSize();
                            }
                            if (mediaSize != null) {
                                if (mediaSize.isPortrait() != (bitmap2.getWidth() <= bitmap2.getHeight())) {
                                    Matrix matrix = new Matrix();
                                    matrix.postRotate(90.0f);
                                    bitmap2 = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
                                }
                            }
                        }
                        PrintUriAdapter.this.f5158b = bitmap2;
                        if (bitmap2 != null) {
                            Objects.requireNonNull(PrintUriAdapter.this);
                            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(null).setContentType(1).setPageCount(1).build(), true ^ printAttributes2.equals(printAttributes));
                        } else {
                            layoutResultCallback.onLayoutFailed(null);
                        }
                        Objects.requireNonNull(PrintUriAdapter.this);
                    }

                    @Override // android.os.AsyncTask
                    public void onPreExecute() {
                        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.print.PrintHelper.PrintUriAdapter.1.1
                            @Override // android.os.CancellationSignal.OnCancelListener
                            public void onCancel() {
                                Objects.requireNonNull(PrintUriAdapter.this);
                                Objects.requireNonNull(null);
                                throw null;
                            }
                        });
                    }
                }.execute(new Uri[0]);
            }
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
            throw null;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f5147a = i2 > 23;
        f5148b = i2 != 23;
    }

    /* renamed from: a */
    public static Bitmap m3466a(Bitmap bitmap, int i2) {
        if (i2 != 1) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }
}
