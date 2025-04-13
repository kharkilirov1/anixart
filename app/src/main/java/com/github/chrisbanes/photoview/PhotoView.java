package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.github.chrisbanes.photoview.Util;
import java.util.Objects;

/* loaded from: classes.dex */
public class PhotoView extends AppCompatImageView {

    /* renamed from: e */
    public PhotoViewAttacher f8899e;

    /* renamed from: f */
    public ImageView.ScaleType f8900f;

    public PhotoView(Context context) {
        super(context, null, 0);
        this.f8899e = new PhotoViewAttacher(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f8900f;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f8900f = null;
        }
    }

    public PhotoViewAttacher getAttacher() {
        return this.f8899e;
    }

    public RectF getDisplayRect() {
        return this.f8899e.m5383c();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f8899e.f8916m;
    }

    public float getMaximumScale() {
        return this.f8899e.f8909f;
    }

    public float getMediumScale() {
        return this.f8899e.f8908e;
    }

    public float getMinimumScale() {
        return this.f8899e.f8907d;
    }

    public float getScale() {
        return this.f8899e.m5388h();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f8899e.f8903C;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f8899e.f8910g = z;
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        if (frame) {
            this.f8899e.m5392l();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        PhotoViewAttacher photoViewAttacher = this.f8899e;
        if (photoViewAttacher != null) {
            photoViewAttacher.m5392l();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i2) {
        super.setImageResource(i2);
        PhotoViewAttacher photoViewAttacher = this.f8899e;
        if (photoViewAttacher != null) {
            photoViewAttacher.m5392l();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        PhotoViewAttacher photoViewAttacher = this.f8899e;
        if (photoViewAttacher != null) {
            photoViewAttacher.m5392l();
        }
    }

    public void setMaximumScale(float f2) {
        PhotoViewAttacher photoViewAttacher = this.f8899e;
        Util.m5394a(photoViewAttacher.f8907d, photoViewAttacher.f8908e, f2);
        photoViewAttacher.f8909f = f2;
    }

    public void setMediumScale(float f2) {
        PhotoViewAttacher photoViewAttacher = this.f8899e;
        Util.m5394a(photoViewAttacher.f8907d, f2, photoViewAttacher.f8909f);
        photoViewAttacher.f8908e = f2;
    }

    public void setMinimumScale(float f2) {
        PhotoViewAttacher photoViewAttacher = this.f8899e;
        Util.m5394a(f2, photoViewAttacher.f8908e, photoViewAttacher.f8909f);
        photoViewAttacher.f8907d = f2;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f8899e.f8924u = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f8899e.f8913j.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8899e.f8925v = onLongClickListener;
    }

    public void setOnMatrixChangeListener(OnMatrixChangedListener onMatrixChangedListener) {
        this.f8899e.f8920q = onMatrixChangedListener;
    }

    public void setOnOutsidePhotoTapListener(OnOutsidePhotoTapListener onOutsidePhotoTapListener) {
        this.f8899e.f8922s = onOutsidePhotoTapListener;
    }

    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
        this.f8899e.f8921r = onPhotoTapListener;
    }

    public void setOnScaleChangeListener(OnScaleChangedListener onScaleChangedListener) {
        this.f8899e.f8926w = onScaleChangedListener;
    }

    public void setOnSingleFlingListener(OnSingleFlingListener onSingleFlingListener) {
        this.f8899e.f8927x = onSingleFlingListener;
    }

    public void setOnViewDragListener(OnViewDragListener onViewDragListener) {
        this.f8899e.f8928y = onViewDragListener;
    }

    public void setOnViewTapListener(OnViewTapListener onViewTapListener) {
        this.f8899e.f8923t = onViewTapListener;
    }

    public void setRotationBy(float f2) {
        PhotoViewAttacher photoViewAttacher = this.f8899e;
        photoViewAttacher.f8917n.postRotate(f2 % 360.0f);
        photoViewAttacher.m5381a();
    }

    public void setRotationTo(float f2) {
        PhotoViewAttacher photoViewAttacher = this.f8899e;
        photoViewAttacher.f8917n.setRotate(f2 % 360.0f);
        photoViewAttacher.m5381a();
    }

    public void setScale(float f2) {
        this.f8899e.m5391k(f2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        PhotoViewAttacher photoViewAttacher = this.f8899e;
        if (photoViewAttacher == null) {
            this.f8900f = scaleType;
            return;
        }
        Objects.requireNonNull(photoViewAttacher);
        boolean z = true;
        if (scaleType == null) {
            z = false;
        } else if (Util.C08911.f8944a[scaleType.ordinal()] == 1) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (!z || scaleType == photoViewAttacher.f8903C) {
            return;
        }
        photoViewAttacher.f8903C = scaleType;
        photoViewAttacher.m5392l();
    }

    public void setZoomTransitionDuration(int i2) {
        this.f8899e.f8906c = i2;
    }

    public void setZoomable(boolean z) {
        PhotoViewAttacher photoViewAttacher = this.f8899e;
        photoViewAttacher.f8902B = z;
        photoViewAttacher.m5392l();
    }
}
