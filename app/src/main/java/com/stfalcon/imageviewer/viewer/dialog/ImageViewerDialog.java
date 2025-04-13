package com.stfalcon.imageviewer.viewer.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import androidx.appcompat.app.AlertDialog;
import com.github.chrisbanes.photoview.PhotoView;
import com.stfalcon.imageviewer.viewer.adapter.ImagesPagerAdapter;
import com.stfalcon.imageviewer.viewer.builder.BuilderData;
import com.stfalcon.imageviewer.viewer.view.ImageViewerView;
import com.swiftsoft.anixartd.C2507R;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImageViewerDialog.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/stfalcon/imageviewer/viewer/dialog/ImageViewerDialog;", "T", "", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ImageViewerDialog<T> {

    /* renamed from: a */
    public final AlertDialog f25275a;

    /* renamed from: b */
    public final ImageViewerView<T> f25276b;

    /* renamed from: c */
    public boolean f25277c;

    /* renamed from: d */
    public final BuilderData<T> f25278d;

    public ImageViewerDialog(@NotNull Context context, @NotNull BuilderData<T> builderData) {
        Intrinsics.m32180i(context, "context");
        Intrinsics.m32180i(builderData, "builderData");
        this.f25278d = builderData;
        ImageViewerView<T> imageViewerView = new ImageViewerView<>(context, null, 0, 6);
        this.f25276b = imageViewerView;
        this.f25277c = true;
        imageViewerView.setZoomingAllowed$imageviewer_release(builderData.f25270e);
        imageViewerView.setSwipeToDismissAllowed$imageviewer_release(builderData.f25271f);
        imageViewerView.setContainerPadding$imageviewer_release(builderData.f25268c);
        Objects.requireNonNull(builderData);
        imageViewerView.setImagesMargin$imageviewer_release(0);
        Objects.requireNonNull(builderData);
        imageViewerView.setOverlayView$imageviewer_release(null);
        imageViewerView.setBackgroundColor(builderData.f25266a);
        imageViewerView.m14038h(builderData.f25273h, builderData.f25267b, builderData.f25274i);
        imageViewerView.setOnPageChange$imageviewer_release(new Function1<Integer, Unit>() { // from class: com.stfalcon.imageviewer.viewer.dialog.ImageViewerDialog$setupViewerView$$inlined$apply$lambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Integer num) {
                num.intValue();
                Objects.requireNonNull(ImageViewerDialog.this.f25278d);
                return Unit.f63088a;
            }
        });
        imageViewerView.setOnDismiss$imageviewer_release(new Function0<Unit>() { // from class: com.stfalcon.imageviewer.viewer.dialog.ImageViewerDialog$setupViewerView$$inlined$apply$lambda$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                ImageViewerDialog.this.f25275a.dismiss();
                return Unit.f63088a;
            }
        });
        AlertDialog create = new AlertDialog.Builder(context, builderData.f25269d ? C2507R.style.ImageViewerDialog_NoStatusBar : C2507R.style.ImageViewerDialog_Default).setView(imageViewerView).mo374h(new DialogInterface.OnKeyListener() { // from class: com.stfalcon.imageviewer.viewer.dialog.ImageViewerDialog.1
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent event) {
                T t;
                ImageViewerDialog imageViewerDialog = ImageViewerDialog.this;
                Intrinsics.m32175d(event, "event");
                Objects.requireNonNull(imageViewerDialog);
                if (i2 != 4 || event.getAction() != 1 || event.isCanceled()) {
                    return false;
                }
                if (imageViewerDialog.f25276b.m14036f()) {
                    ImageViewerView<T> imageViewerView2 = imageViewerDialog.f25276b;
                    ImagesPagerAdapter<T> imagesPagerAdapter = imageViewerView2.f25299o;
                    if (imagesPagerAdapter != null) {
                        int currentPosition$imageviewer_release = imageViewerView2.getCurrentPosition$imageviewer_release();
                        Iterator<T> it = imagesPagerAdapter.f25259f.iterator();
                        do {
                            t = (T) null;
                            if (!it.hasNext()) {
                                break;
                            }
                            t = it.next();
                        } while (!(((ImagesPagerAdapter.ViewHolder) t).f25255a == currentPosition$imageviewer_release));
                        ImagesPagerAdapter.ViewHolder viewHolder = t;
                        if (viewHolder != null) {
                            PhotoView resetScale = viewHolder.f25263d;
                            Intrinsics.m32180i(resetScale, "$this$resetScale");
                            resetScale.f8899e.m5391k(resetScale.getMinimumScale(), true);
                        }
                    }
                } else {
                    imageViewerDialog.f25276b.m14034d();
                }
                return true;
            }
        }).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.stfalcon.imageviewer.viewer.dialog.ImageViewerDialog$$special$$inlined$apply$lambda$1
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ImageViewerDialog imageViewerDialog = ImageViewerDialog.this;
                imageViewerDialog.f25276b.m14037g(imageViewerDialog.f25278d.f25272g, imageViewerDialog.f25277c);
            }
        });
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.stfalcon.imageviewer.viewer.dialog.ImageViewerDialog$$special$$inlined$apply$lambda$2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Objects.requireNonNull(ImageViewerDialog.this.f25278d);
            }
        });
        this.f25275a = create;
    }
}
