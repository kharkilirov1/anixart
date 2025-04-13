package com.swiftsoft.anixartd.p015ui.model.main.editor;

import android.view.View;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.swiftsoft.anixartd.C2507R;
import com.swiftsoft.anixartd.p015ui.model.main.editor.CollectionEditorHeaderModel;
import java.io.File;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes2.dex */
public class CollectionEditorHeaderModel_ extends CollectionEditorHeaderModel implements GeneratedModel<View>, CollectionEditorHeaderModelBuilder {
    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, View view, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.editor.CollectionEditorHeaderModelBuilder
    /* renamed from: U */
    public CollectionEditorHeaderModelBuilder mo15957U(boolean z) {
        m4524l2();
        this.f29666o = z;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.editor.CollectionEditorHeaderModelBuilder
    /* renamed from: Y */
    public CollectionEditorHeaderModelBuilder mo15958Y(long j2) {
        m4524l2();
        this.f29667p = j2;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.editor.CollectionEditorHeaderModelBuilder
    /* renamed from: Z */
    public CollectionEditorHeaderModelBuilder mo15959Z(@Nullable File file) {
        m4524l2();
        this.f29665n = file;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.editor.CollectionEditorHeaderModelBuilder
    /* renamed from: a */
    public CollectionEditorHeaderModelBuilder mo15960a(@androidx.annotation.Nullable CharSequence charSequence) {
        m4520h2(charSequence);
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.editor.CollectionEditorHeaderModelBuilder
    /* renamed from: c */
    public CollectionEditorHeaderModelBuilder mo15961c(@Nullable String str) {
        m4524l2();
        this.f29664m = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    @LayoutRes
    /* renamed from: d2 */
    public int mo4499d2() {
        return C2507R.layout.item_collection_editor_header;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionEditorHeaderModel_) || !super.equals(obj)) {
            return false;
        }
        CollectionEditorHeaderModel_ collectionEditorHeaderModel_ = (CollectionEditorHeaderModel_) obj;
        Objects.requireNonNull(collectionEditorHeaderModel_);
        String str = this.f29662k;
        if (str == null ? collectionEditorHeaderModel_.f29662k != null : !str.equals(collectionEditorHeaderModel_.f29662k)) {
            return false;
        }
        String str2 = this.f29663l;
        if (str2 == null ? collectionEditorHeaderModel_.f29663l != null : !str2.equals(collectionEditorHeaderModel_.f29663l)) {
            return false;
        }
        String str3 = this.f29664m;
        if (str3 == null ? collectionEditorHeaderModel_.f29664m != null : !str3.equals(collectionEditorHeaderModel_.f29664m)) {
            return false;
        }
        File file = this.f29665n;
        if (file == null ? collectionEditorHeaderModel_.f29665n != null : !file.equals(collectionEditorHeaderModel_.f29665n)) {
            return false;
        }
        if (this.f29666o == collectionEditorHeaderModel_.f29666o && this.f29667p == collectionEditorHeaderModel_.f29667p) {
            return (this.f29668q == null) == (collectionEditorHeaderModel_.f29668q == null);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(View view, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.editor.CollectionEditorHeaderModelBuilder
    /* renamed from: g */
    public CollectionEditorHeaderModelBuilder mo15962g(@Nullable String str) {
        m4524l2();
        this.f29663l = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel<View> mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.f29662k;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f29663l;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f29664m;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        File file = this.f29665n;
        int hashCode5 = (((hashCode4 + (file != null ? file.hashCode() : 0)) * 31) + (this.f29666o ? 1 : 0)) * 31;
        long j2 = this.f29667p;
        return ((hashCode5 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f29668q != null ? 1 : 0);
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.editor.CollectionEditorHeaderModelBuilder
    /* renamed from: j */
    public CollectionEditorHeaderModelBuilder mo15963j(@Nullable String str) {
        m4524l2();
        this.f29662k = str;
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, View view) {
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, View view) {
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.editor.CollectionEditorHeaderModelBuilder
    /* renamed from: r1 */
    public CollectionEditorHeaderModelBuilder mo15964r1(CollectionEditorHeaderModel.Listener listener) {
        m4524l2();
        this.f29668q = listener;
        return this;
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.editor.CollectionEditorHeaderModel, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CollectionEditorHeaderModel_{title=");
        m24u.append(this.f29662k);
        m24u.append(", description=");
        m24u.append(this.f29663l);
        m24u.append(", image=");
        m24u.append(this.f29664m);
        m24u.append(", imageFile=");
        m24u.append(this.f29665n);
        m24u.append(", mPrivate=");
        m24u.append(this.f29666o);
        m24u.append(", releaseCount=");
        m24u.append(this.f29667p);
        m24u.append(", listener=");
        m24u.append(this.f29668q);
        m24u.append("}");
        m24u.append(super.toString());
        return m24u.toString();
    }

    @Override // com.swiftsoft.anixartd.p015ui.model.main.editor.CollectionEditorHeaderModel
    /* renamed from: w2 */
    public void mo4506s2(View view) {
        super.mo4506s2(view);
    }
}
