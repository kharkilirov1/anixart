package com.yandex.div.core.view2;

import com.yandex.div.core.extension.DivExtensionController;
import com.yandex.div.core.view2.divs.DivContainerBinder;
import com.yandex.div.core.view2.divs.DivCustomBinder;
import com.yandex.div.core.view2.divs.DivGifImageBinder;
import com.yandex.div.core.view2.divs.DivGridBinder;
import com.yandex.div.core.view2.divs.DivImageBinder;
import com.yandex.div.core.view2.divs.DivIndicatorBinder;
import com.yandex.div.core.view2.divs.DivInputBinder;
import com.yandex.div.core.view2.divs.DivPagerBinder;
import com.yandex.div.core.view2.divs.DivSelectBinder;
import com.yandex.div.core.view2.divs.DivSeparatorBinder;
import com.yandex.div.core.view2.divs.DivSliderBinder;
import com.yandex.div.core.view2.divs.DivStateBinder;
import com.yandex.div.core.view2.divs.DivTextBinder;
import com.yandex.div.core.view2.divs.DivVideoBinder;
import com.yandex.div.core.view2.divs.PagerIndicatorConnector;
import com.yandex.div.core.view2.divs.gallery.DivGalleryBinder;
import com.yandex.div.core.view2.divs.tabs.DivTabsBinder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
/* loaded from: classes2.dex */
public final class DivBinder_Factory implements Factory<DivBinder> {

    /* renamed from: a */
    public final Provider<DivValidator> f31625a;

    /* renamed from: b */
    public final Provider<DivTextBinder> f31626b;

    /* renamed from: c */
    public final Provider<DivContainerBinder> f31627c;

    /* renamed from: d */
    public final Provider<DivSeparatorBinder> f31628d;

    /* renamed from: e */
    public final Provider<DivImageBinder> f31629e;

    /* renamed from: f */
    public final Provider<DivGifImageBinder> f31630f;

    /* renamed from: g */
    public final Provider<DivGridBinder> f31631g;

    /* renamed from: h */
    public final Provider<DivGalleryBinder> f31632h;

    /* renamed from: i */
    public final Provider<DivPagerBinder> f31633i;

    /* renamed from: j */
    public final Provider<DivTabsBinder> f31634j;

    /* renamed from: k */
    public final Provider<DivStateBinder> f31635k;

    /* renamed from: l */
    public final Provider<DivCustomBinder> f31636l;

    /* renamed from: m */
    public final Provider<DivIndicatorBinder> f31637m;

    /* renamed from: n */
    public final Provider<DivSliderBinder> f31638n;

    /* renamed from: o */
    public final Provider<DivInputBinder> f31639o;

    /* renamed from: p */
    public final Provider<DivSelectBinder> f31640p;

    /* renamed from: q */
    public final Provider<DivVideoBinder> f31641q;

    /* renamed from: r */
    public final Provider<DivExtensionController> f31642r;

    /* renamed from: s */
    public final Provider<PagerIndicatorConnector> f31643s;

    public DivBinder_Factory(Provider<DivValidator> provider, Provider<DivTextBinder> provider2, Provider<DivContainerBinder> provider3, Provider<DivSeparatorBinder> provider4, Provider<DivImageBinder> provider5, Provider<DivGifImageBinder> provider6, Provider<DivGridBinder> provider7, Provider<DivGalleryBinder> provider8, Provider<DivPagerBinder> provider9, Provider<DivTabsBinder> provider10, Provider<DivStateBinder> provider11, Provider<DivCustomBinder> provider12, Provider<DivIndicatorBinder> provider13, Provider<DivSliderBinder> provider14, Provider<DivInputBinder> provider15, Provider<DivSelectBinder> provider16, Provider<DivVideoBinder> provider17, Provider<DivExtensionController> provider18, Provider<PagerIndicatorConnector> provider19) {
        this.f31625a = provider;
        this.f31626b = provider2;
        this.f31627c = provider3;
        this.f31628d = provider4;
        this.f31629e = provider5;
        this.f31630f = provider6;
        this.f31631g = provider7;
        this.f31632h = provider8;
        this.f31633i = provider9;
        this.f31634j = provider10;
        this.f31635k = provider11;
        this.f31636l = provider12;
        this.f31637m = provider13;
        this.f31638n = provider14;
        this.f31639o = provider15;
        this.f31640p = provider16;
        this.f31641q = provider17;
        this.f31642r = provider18;
        this.f31643s = provider19;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new DivBinder(this.f31625a.get(), this.f31626b.get(), this.f31627c.get(), this.f31628d.get(), this.f31629e.get(), this.f31630f.get(), this.f31631g.get(), this.f31632h.get(), this.f31633i.get(), this.f31634j.get(), this.f31635k.get(), this.f31636l.get(), this.f31637m.get(), this.f31638n.get(), this.f31639o.get(), this.f31640p.get(), this.f31641q.get(), this.f31642r.get(), this.f31643s.get());
    }
}
