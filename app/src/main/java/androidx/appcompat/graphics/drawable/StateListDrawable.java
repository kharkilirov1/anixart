package androidx.appcompat.graphics.drawable;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.DrawableContainer;

@SuppressLint
@RestrictTo
/* loaded from: classes.dex */
class StateListDrawable extends DrawableContainer {

    /* renamed from: o */
    public StateListState f671o;

    /* renamed from: p */
    public boolean f672p;

    public static class StateListState extends DrawableContainer.DrawableContainerState {

        /* renamed from: J */
        public int[][] f673J;

        public StateListState(StateListState stateListState, StateListDrawable stateListDrawable, Resources resources) {
            super(stateListState, stateListDrawable, resources);
            if (stateListState != null) {
                this.f673J = stateListState.f673J;
            } else {
                this.f673J = new int[this.f648g.length][];
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableContainer.DrawableContainerState
        /* renamed from: e */
        public void mo516e(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            Drawable[] drawableArr2 = this.f648g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
            }
            this.f648g = drawableArr;
            int[][] iArr = new int[i3][];
            System.arraycopy(this.f673J, 0, iArr, 0, i2);
            this.f673J = iArr;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableContainer.DrawableContainerState
        /* renamed from: f */
        public void mo505f() {
            int[][] iArr = this.f673J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f673J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f673J = iArr2;
        }

        /* renamed from: h */
        public int m519h(int[] iArr) {
            int[][] iArr2 = this.f673J;
            int i2 = this.f649h;
            for (int i3 = 0; i3 < i2; i3++) {
                if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                    return i3;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new StateListDrawable(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new StateListDrawable(this, resources);
        }
    }

    public StateListDrawable() {
        this(null, null);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    @RequiresApi
    public void applyTheme(@NonNull Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer
    /* renamed from: e */
    public void mo500e(@NonNull DrawableContainer.DrawableContainerState drawableContainerState) {
        super.mo500e(drawableContainerState);
        if (drawableContainerState instanceof StateListState) {
            this.f671o = (StateListState) drawableContainerState;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public StateListState mo499b() {
        return new StateListState(this.f671o, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f672p) {
            super.mutate();
            this.f671o.mo505f();
            this.f672p = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m519h = this.f671o.m519h(iArr);
        if (m519h < 0) {
            m519h = this.f671o.m519h(StateSet.WILD_CARD);
        }
        return m511d(m519h) || onStateChange;
    }

    public StateListDrawable(StateListState stateListState, Resources resources) {
        mo500e(new StateListState(stateListState, this, resources));
        onStateChange(getState());
    }

    public StateListDrawable(@Nullable StateListState stateListState) {
    }
}
