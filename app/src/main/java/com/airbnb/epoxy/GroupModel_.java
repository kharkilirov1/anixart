package com.airbnb.epoxy;

import java.util.Objects;
import p000a.C0000a;

/* loaded from: classes.dex */
public class GroupModel_ extends GroupModel implements GeneratedModel<ModelGroupHolder>, GroupModelBuilder {
    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: A2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, ModelGroupHolder modelGroupHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: B2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, ModelGroupHolder modelGroupHolder) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelGroup, com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: C2 */
    public void mo4506s2(ModelGroupHolder modelGroupHolder) {
        super.mo4506s2(modelGroupHolder);
    }

    @Override // com.airbnb.epoxy.EpoxyModelGroup
    /* renamed from: I2 */
    public void mo4506s2(ModelGroupHolder modelGroupHolder) {
        super.mo4506s2(modelGroupHolder);
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: N1 */
    public void mo4494N1(EpoxyViewHolder epoxyViewHolder, ModelGroupHolder modelGroupHolder, int i2) {
        m4529t2("The model was changed between being added to the controller and being bound.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: X1 */
    public void mo4495X1(EpoxyController epoxyController) {
        epoxyController.addInternal(this);
        m4518Y1(epoxyController);
    }

    @Override // com.airbnb.epoxy.EpoxyModelGroup, com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GroupModel_) || !super.equals(obj)) {
            return false;
        }
        Objects.requireNonNull((GroupModel_) obj);
        return true;
    }

    @Override // com.airbnb.epoxy.GeneratedModel
    /* renamed from: f0 */
    public void mo4501f0(ModelGroupHolder modelGroupHolder, int i2) {
        m4529t2("The model was changed during the bind call.", i2);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: g2 */
    public EpoxyModel mo4503g2(long j2) {
        super.mo4503g2(j2);
        return this;
    }

    @Override // com.airbnb.epoxy.EpoxyModelGroup, com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        return (((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0;
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    /* renamed from: o2 */
    public /* bridge */ /* synthetic */ void mo4504o2(float f2, float f3, int i2, int i3, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    /* renamed from: p2 */
    public /* bridge */ /* synthetic */ void mo4505p2(int i2, Object obj) {
    }

    @Override // com.airbnb.epoxy.EpoxyModelGroup, com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    /* renamed from: s2 */
    public void mo4506s2(Object obj) {
        super.mo4506s2((ModelGroupHolder) obj);
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public String toString() {
        StringBuilder m24u = C0000a.m24u("GroupModel_{}");
        m24u.append(super.toString());
        return m24u.toString();
    }
}
