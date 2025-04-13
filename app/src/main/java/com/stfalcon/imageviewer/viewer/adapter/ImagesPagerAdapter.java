package com.stfalcon.imageviewer.viewer.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.github.chrisbanes.photoview.OnViewDragListener;
import com.github.chrisbanes.photoview.PhotoView;
import com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter;
import com.stfalcon.imageviewer.loader.ImageLoader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ImagesPagerAdapter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/stfalcon/imageviewer/viewer/adapter/ImagesPagerAdapter;", "T", "Lcom/stfalcon/imageviewer/common/pager/RecyclingPagerAdapter;", "Lcom/stfalcon/imageviewer/viewer/adapter/ImagesPagerAdapter$ViewHolder;", "ViewHolder", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ImagesPagerAdapter<T> extends RecyclingPagerAdapter<ImagesPagerAdapter<T>.ViewHolder> {

    /* renamed from: e */
    public List<? extends T> f25258e;

    /* renamed from: f */
    public final List<ImagesPagerAdapter<T>.ViewHolder> f25259f = new ArrayList();

    /* renamed from: g */
    public final Context f25260g;

    /* renamed from: h */
    public final ImageLoader<T> f25261h;

    /* renamed from: i */
    public final boolean f25262i;

    /* compiled from: ImagesPagerAdapter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/stfalcon/imageviewer/viewer/adapter/ImagesPagerAdapter$ViewHolder;", "Lcom/stfalcon/imageviewer/common/pager/RecyclingPagerAdapter$ViewHolder;", "imageviewer_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public final class ViewHolder extends RecyclingPagerAdapter.ViewHolder {

        /* renamed from: d */
        public final PhotoView f25263d;

        public ViewHolder(@NotNull View view) {
            super(view);
            this.f25263d = (PhotoView) view;
        }
    }

    public ImagesPagerAdapter(@NotNull Context context, @NotNull List<? extends T> list, @NotNull ImageLoader<T> imageLoader, boolean z) {
        this.f25260g = context;
        this.f25261h = imageLoader;
        this.f25262i = z;
        this.f25258e = list;
    }

    @Override // com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter
    /* renamed from: l */
    public int mo14027l() {
        return this.f25258e.size();
    }

    @Override // com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter
    /* renamed from: m */
    public void mo14028m(RecyclingPagerAdapter.ViewHolder viewHolder, int i2) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        viewHolder2.f25255a = i2;
        ImagesPagerAdapter imagesPagerAdapter = ImagesPagerAdapter.this;
        imagesPagerAdapter.f25261h.mo14030b(viewHolder2.f25263d, imagesPagerAdapter.f25258e.get(i2));
    }

    @Override // com.stfalcon.imageviewer.common.pager.RecyclingPagerAdapter
    /* renamed from: n */
    public RecyclingPagerAdapter.ViewHolder mo14029n(ViewGroup viewGroup, int i2) {
        final PhotoView photoView = new PhotoView(this.f25260g);
        photoView.setEnabled(this.f25262i);
        photoView.setOnViewDragListener(new OnViewDragListener() { // from class: com.stfalcon.imageviewer.viewer.adapter.ImagesPagerAdapter$onCreateViewHolder$photoView$1$1
            @Override // com.github.chrisbanes.photoview.OnViewDragListener
            /* renamed from: a */
            public final void mo5379a(float f2, float f3) {
                PhotoView photoView2 = PhotoView.this;
                photoView2.setAllowParentInterceptOnEdge(photoView2.getScale() == 1.0f);
            }
        });
        ImagesPagerAdapter<T>.ViewHolder viewHolder = new ViewHolder(photoView);
        this.f25259f.add(viewHolder);
        return viewHolder;
    }
}
