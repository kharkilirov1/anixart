package com.yandex.div.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.C2806R;
import com.yandex.div.core.widget.GridContainer;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import com.yandex.mobile.ads.C4632R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: GridContainer.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0011\u0018\u00002\u00020\u0001:\u0007\u0014\u0015\u0016\u0017\u0018\u0019\u001aR*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R$\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR\u0011\u0010\u0013\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u001b"}, m31884d2 = {"Lcom/yandex/div/core/widget/GridContainer;", "Lcom/yandex/div/internal/widget/DivViewGroup;", "", "value", "c", "I", "getGravity", "()I", "setGravity", "(I)V", "gravity", "getPaddingHorizontal", "paddingHorizontal", "getPaddingVertical", "paddingVertical", "getColumnCount", "setColumnCount", "columnCount", "getRowCount", "rowCount", "Cell", "CellProjection", "Companion", "Grid", "Line", "SizeConstraint", "SpannedCellComparator", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
@SuppressLint
/* loaded from: classes2.dex */
public class GridContainer extends DivViewGroup {

    /* renamed from: c, reason: from kotlin metadata */
    public int gravity;

    /* renamed from: d */
    @NotNull
    public final Grid f32969d;

    /* renamed from: e */
    public int f32970e;

    /* renamed from: f */
    public boolean f32971f;

    /* compiled from: GridContainer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/widget/GridContainer$Cell;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Cell {

        /* renamed from: a */
        public final int f32972a;

        /* renamed from: b */
        public final int f32973b;

        /* renamed from: c */
        public final int f32974c;

        /* renamed from: d */
        public int f32975d;

        /* renamed from: e */
        public int f32976e;

        public Cell(int i2, int i3, int i4, int i5, int i6) {
            this.f32972a = i2;
            this.f32973b = i3;
            this.f32974c = i4;
            this.f32975d = i5;
            this.f32976e = i6;
        }
    }

    /* compiled from: GridContainer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/widget/GridContainer$CellProjection;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class CellProjection {

        /* renamed from: a */
        public final int f32977a;

        /* renamed from: b */
        public final int f32978b;

        /* renamed from: c */
        public final int f32979c;

        /* renamed from: d */
        public final int f32980d;

        /* renamed from: e */
        public final int f32981e;

        /* renamed from: f */
        public final float f32982f;

        public CellProjection(int i2, int i3, int i4, int i5, int i6, float f2) {
            this.f32977a = i2;
            this.f32978b = i3;
            this.f32979c = i4;
            this.f32980d = i5;
            this.f32981e = i6;
            this.f32982f = f2;
        }

        /* renamed from: a */
        public final int m17142a() {
            return this.f32978b + this.f32979c + this.f32980d;
        }

        /* renamed from: b */
        public final int m17143b() {
            return m17142a() / this.f32981e;
        }
    }

    /* compiled from: GridContainer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\n"}, m31884d2 = {"Lcom/yandex/div/core/widget/GridContainer$Companion;", "", "", "DEFAULT_COLUMN_COUNT", "I", "MAX_SIZE", "", "TAG", "Ljava/lang/String;", "UNINITIALIZED_HASH", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    /* compiled from: GridContainer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/widget/GridContainer$Grid;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public final class Grid {

        /* renamed from: a */
        public int f32983a = 1;

        /* renamed from: b */
        @NotNull
        public final Resettable<List<Cell>> f32984b = new Resettable<>(new Function0<List<? extends Cell>>() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_cells$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public List<? extends GridContainer.Cell> invoke() {
                Integer valueOf;
                GridContainer.Grid grid = GridContainer.Grid.this;
                if (GridContainer.this.getChildCount() == 0) {
                    return EmptyList.f63144b;
                }
                int i2 = grid.f32983a;
                ArrayList arrayList = new ArrayList(GridContainer.this.getChildCount());
                int[] iArr = new int[i2];
                int[] iArr2 = new int[i2];
                GridContainer gridContainer = GridContainer.this;
                int childCount = gridContainer.getChildCount();
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i5 < childCount) {
                    int i6 = i5 + 1;
                    View childAt = gridContainer.getChildAt(i5);
                    if (childAt.getVisibility() == 8) {
                        i5 = i6;
                    } else {
                        Integer m31947W = ArraysKt.m31947W(iArr2);
                        int intValue = m31947W == null ? 0 : m31947W.intValue();
                        int m31933I = ArraysKt.m31933I(iArr2, intValue);
                        int i7 = i4 + intValue;
                        IntRange m32243j = RangesKt.m32243j(i3, i2);
                        int i8 = m32243j.f63380b;
                        int i9 = m32243j.f63381c;
                        if (i8 <= i9) {
                            while (true) {
                                int i10 = i8 + 1;
                                iArr2[i8] = Math.max(i3, iArr2[i8] - intValue);
                                if (i8 == i9) {
                                    break;
                                }
                                i8 = i10;
                            }
                        }
                        DivViewGroup.Companion companion = DivViewGroup.f33964b;
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                        int min = Math.min(divLayoutParams.f33960e, i2 - m31933I);
                        int i11 = divLayoutParams.f33961f;
                        arrayList.add(new GridContainer.Cell(i5, m31933I, i7, min, i11));
                        int i12 = m31933I + min;
                        while (true) {
                            int i13 = m31933I;
                            if (i13 >= i12) {
                                break;
                            }
                            m31933I = i13 + 1;
                            if (iArr2[i13] > 0) {
                                Object obj = arrayList.get(iArr[i13]);
                                Intrinsics.m32178g(obj, "cells[cellIndices[i]]");
                                GridContainer.Cell cell = (GridContainer.Cell) obj;
                                int i14 = cell.f32973b;
                                int i15 = cell.f32975d + i14;
                                while (i14 < i15) {
                                    int i16 = iArr2[i14];
                                    iArr2[i14] = 0;
                                    i14++;
                                }
                                cell.f32976e = i7 - cell.f32974c;
                            }
                            iArr[i13] = i5;
                            iArr2[i13] = i11;
                        }
                        i5 = i6;
                        i4 = i7;
                        i3 = 0;
                    }
                }
                if (i2 == 0) {
                    valueOf = null;
                } else {
                    int i17 = iArr2[0];
                    int m31928D = ArraysKt.m31928D(iArr2);
                    if (m31928D == 0) {
                        valueOf = Integer.valueOf(i17);
                    } else {
                        int max = Math.max(1, i17);
                        if (1 <= m31928D) {
                            int i18 = 1;
                            while (true) {
                                int i19 = i18 + 1;
                                int i20 = iArr2[i18];
                                int max2 = Math.max(1, i20);
                                if (max > max2) {
                                    i17 = i20;
                                    max = max2;
                                }
                                if (i18 == m31928D) {
                                    break;
                                }
                                i18 = i19;
                            }
                        }
                        valueOf = Integer.valueOf(i17);
                    }
                }
                int intValue2 = ((GridContainer.Cell) kotlin.collections.CollectionsKt.m31991D(arrayList)).f32974c + (valueOf != null ? valueOf.intValue() : 1);
                int size = arrayList.size();
                int i21 = 0;
                while (i21 < size) {
                    int i22 = i21 + 1;
                    GridContainer.Cell cell2 = (GridContainer.Cell) arrayList.get(i21);
                    int i23 = cell2.f32974c;
                    if (cell2.f32976e + i23 > intValue2) {
                        cell2.f32976e = intValue2 - i23;
                    }
                    i21 = i22;
                }
                return arrayList;
            }
        });

        /* renamed from: c */
        @NotNull
        public final Resettable<List<Line>> f32985c = new Resettable<>(new Function0<List<? extends Line>>() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_columns$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public List<? extends GridContainer.Line> invoke() {
                int i2;
                float f2;
                int i3;
                GridContainer.Grid grid = GridContainer.Grid.this;
                int i4 = grid.f32983a;
                GridContainer.SizeConstraint sizeConstraint = grid.f32987e;
                List<GridContainer.Cell> m17184a = grid.f32984b.m17184a();
                ArrayList arrayList = new ArrayList(i4);
                int i5 = 0;
                while (i5 < i4) {
                    i5++;
                    arrayList.add(new GridContainer.Line());
                }
                GridContainer gridContainer = GridContainer.this;
                int size = m17184a.size();
                int i6 = 0;
                while (i6 < size) {
                    int i7 = i6 + 1;
                    GridContainer.Cell cell = m17184a.get(i6);
                    View child = gridContainer.getChildAt(cell.f32972a);
                    Intrinsics.m32178g(child, "child");
                    DivViewGroup.Companion companion = DivViewGroup.f33964b;
                    ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                    int i8 = cell.f32973b;
                    int measuredWidth = child.getMeasuredWidth();
                    int i9 = ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                    int i10 = ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
                    int i11 = cell.f32975d;
                    float f3 = divLayoutParams.f33959d;
                    GridContainer.CellProjection cellProjection = new GridContainer.CellProjection(i8, measuredWidth, i9, i10, i11, f3);
                    if (i11 == 1) {
                        ((GridContainer.Line) arrayList.get(i8)).m17152a(cellProjection.m17142a(), f3);
                    } else {
                        int i12 = i11 - 1;
                        float f4 = f3 / i11;
                        if (i12 >= 0) {
                            int i13 = 0;
                            while (true) {
                                int i14 = i13 + 1;
                                GridContainer.Line.m17151b((GridContainer.Line) arrayList.get(cellProjection.f32977a + i13), 0, f4, 1);
                                if (i13 == i12) {
                                    break;
                                }
                                i13 = i14;
                            }
                        }
                    }
                    i6 = i7;
                }
                ArrayList arrayList2 = new ArrayList();
                GridContainer gridContainer2 = GridContainer.this;
                int size2 = m17184a.size();
                int i15 = 0;
                while (i15 < size2) {
                    int i16 = i15 + 1;
                    GridContainer.Cell cell2 = m17184a.get(i15);
                    View child2 = gridContainer2.getChildAt(cell2.f32972a);
                    Intrinsics.m32178g(child2, "child");
                    DivViewGroup.Companion companion2 = DivViewGroup.f33964b;
                    ViewGroup.LayoutParams layoutParams2 = child2.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                    int i17 = cell2.f32973b;
                    int measuredWidth2 = child2.getMeasuredWidth();
                    int i18 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).leftMargin;
                    int i19 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).rightMargin;
                    int i20 = cell2.f32975d;
                    GridContainer.CellProjection cellProjection2 = new GridContainer.CellProjection(i17, measuredWidth2, i18, i19, i20, divLayoutParams2.f33959d);
                    if (i20 > 1) {
                        arrayList2.add(cellProjection2);
                    }
                    i15 = i16;
                }
                kotlin.collections.CollectionsKt.m32015b0(arrayList2, GridContainer.SpannedCellComparator.f32998b);
                int size3 = arrayList2.size();
                int i21 = 0;
                while (i21 < size3) {
                    int i22 = i21 + 1;
                    GridContainer.CellProjection cellProjection3 = (GridContainer.CellProjection) arrayList2.get(i21);
                    int i23 = cellProjection3.f32977a;
                    int i24 = (cellProjection3.f32981e + i23) - 1;
                    int m17142a = cellProjection3.m17142a();
                    if (i23 <= i24) {
                        int i25 = i23;
                        i2 = m17142a;
                        f2 = 0.0f;
                        i3 = 0;
                        while (true) {
                            int i26 = i25 + 1;
                            GridContainer.Line line = (GridContainer.Line) arrayList.get(i25);
                            m17142a -= line.f32994b;
                            if (line.m17153c()) {
                                f2 += line.f32995c;
                            } else {
                                int i27 = line.f32994b;
                                if (i27 == 0) {
                                    i3++;
                                }
                                i2 -= i27;
                            }
                            if (i25 == i24) {
                                break;
                            }
                            i25 = i26;
                        }
                    } else {
                        i2 = m17142a;
                        f2 = 0.0f;
                        i3 = 0;
                    }
                    if (f2 > 0.0f) {
                        if (i23 <= i24) {
                            while (true) {
                                int i28 = i23 + 1;
                                GridContainer.Line line2 = (GridContainer.Line) arrayList.get(i23);
                                if (line2.m17153c()) {
                                    GridContainer.Line.m17151b(line2, (int) Math.ceil((line2.f32995c / f2) * i2), 0.0f, 2);
                                }
                                if (i23 == i24) {
                                    break;
                                }
                                i23 = i28;
                            }
                        }
                    } else if (m17142a > 0 && i23 <= i24) {
                        while (true) {
                            int i29 = i23 + 1;
                            GridContainer.Line line3 = (GridContainer.Line) arrayList.get(i23);
                            if (i3 <= 0) {
                                GridContainer.Line.m17151b(line3, (m17142a / cellProjection3.f32981e) + line3.f32994b, 0.0f, 2);
                            } else if (line3.f32994b == 0 && !line3.m17153c()) {
                                GridContainer.Line.m17151b(line3, (m17142a / i3) + line3.f32994b, 0.0f, 2);
                            }
                            if (i23 == i24) {
                                break;
                            }
                            i23 = i29;
                        }
                    }
                    i21 = i22;
                }
                grid.m17144a(arrayList, sizeConstraint);
                grid.m17145b(arrayList);
                return arrayList;
            }
        });

        /* renamed from: d */
        @NotNull
        public final Resettable<List<Line>> f32986d = new Resettable<>(new Function0<List<? extends Line>>() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_rows$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public List<? extends GridContainer.Line> invoke() {
                int i2;
                float f2;
                int i3;
                GridContainer.Grid grid = GridContainer.Grid.this;
                int m17149f = grid.m17149f();
                GridContainer.SizeConstraint sizeConstraint = grid.f32988f;
                List<GridContainer.Cell> m17184a = grid.f32984b.m17184a();
                ArrayList arrayList = new ArrayList(m17149f);
                int i4 = 0;
                while (i4 < m17149f) {
                    i4++;
                    arrayList.add(new GridContainer.Line());
                }
                GridContainer gridContainer = GridContainer.this;
                int size = m17184a.size();
                int i5 = 0;
                while (i5 < size) {
                    int i6 = i5 + 1;
                    GridContainer.Cell cell = m17184a.get(i5);
                    View child = gridContainer.getChildAt(cell.f32972a);
                    Intrinsics.m32178g(child, "child");
                    DivViewGroup.Companion companion = DivViewGroup.f33964b;
                    ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                    int i7 = cell.f32974c;
                    int measuredHeight = child.getMeasuredHeight();
                    int i8 = ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                    int i9 = ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                    int i10 = cell.f32976e;
                    float f3 = divLayoutParams.f33958c;
                    GridContainer.CellProjection cellProjection = new GridContainer.CellProjection(i7, measuredHeight, i8, i9, i10, f3);
                    if (i10 == 1) {
                        ((GridContainer.Line) arrayList.get(i7)).m17152a(cellProjection.m17142a(), f3);
                    } else {
                        int i11 = i10 - 1;
                        float f4 = f3 / i10;
                        if (i11 >= 0) {
                            int i12 = 0;
                            while (true) {
                                int i13 = i12 + 1;
                                GridContainer.Line.m17151b((GridContainer.Line) arrayList.get(cellProjection.f32977a + i12), 0, f4, 1);
                                if (i12 == i11) {
                                    break;
                                }
                                i12 = i13;
                            }
                        }
                    }
                    i5 = i6;
                }
                ArrayList arrayList2 = new ArrayList();
                GridContainer gridContainer2 = GridContainer.this;
                int size2 = m17184a.size();
                int i14 = 0;
                while (i14 < size2) {
                    int i15 = i14 + 1;
                    GridContainer.Cell cell2 = m17184a.get(i14);
                    View child2 = gridContainer2.getChildAt(cell2.f32972a);
                    Intrinsics.m32178g(child2, "child");
                    DivViewGroup.Companion companion2 = DivViewGroup.f33964b;
                    ViewGroup.LayoutParams layoutParams2 = child2.getLayoutParams();
                    Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
                    int i16 = cell2.f32974c;
                    int measuredHeight2 = child2.getMeasuredHeight();
                    int i17 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).topMargin;
                    int i18 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).bottomMargin;
                    int i19 = cell2.f32976e;
                    GridContainer.CellProjection cellProjection2 = new GridContainer.CellProjection(i16, measuredHeight2, i17, i18, i19, divLayoutParams2.f33958c);
                    if (i19 > 1) {
                        arrayList2.add(cellProjection2);
                    }
                    i14 = i15;
                }
                kotlin.collections.CollectionsKt.m32015b0(arrayList2, GridContainer.SpannedCellComparator.f32998b);
                int size3 = arrayList2.size();
                int i20 = 0;
                while (i20 < size3) {
                    int i21 = i20 + 1;
                    GridContainer.CellProjection cellProjection3 = (GridContainer.CellProjection) arrayList2.get(i20);
                    int i22 = cellProjection3.f32977a;
                    int i23 = (cellProjection3.f32981e + i22) - 1;
                    int m17142a = cellProjection3.m17142a();
                    if (i22 <= i23) {
                        int i24 = i22;
                        i2 = m17142a;
                        f2 = 0.0f;
                        i3 = 0;
                        while (true) {
                            int i25 = i24 + 1;
                            GridContainer.Line line = (GridContainer.Line) arrayList.get(i24);
                            m17142a -= line.f32994b;
                            if (line.m17153c()) {
                                f2 += line.f32995c;
                            } else {
                                int i26 = line.f32994b;
                                if (i26 == 0) {
                                    i3++;
                                }
                                i2 -= i26;
                            }
                            if (i24 == i23) {
                                break;
                            }
                            i24 = i25;
                        }
                    } else {
                        i2 = m17142a;
                        f2 = 0.0f;
                        i3 = 0;
                    }
                    if (f2 > 0.0f) {
                        if (i22 <= i23) {
                            while (true) {
                                int i27 = i22 + 1;
                                GridContainer.Line line2 = (GridContainer.Line) arrayList.get(i22);
                                if (line2.m17153c()) {
                                    GridContainer.Line.m17151b(line2, (int) Math.ceil((line2.f32995c / f2) * i2), 0.0f, 2);
                                }
                                if (i22 == i23) {
                                    break;
                                }
                                i22 = i27;
                            }
                        }
                    } else if (m17142a > 0 && i22 <= i23) {
                        while (true) {
                            int i28 = i22 + 1;
                            GridContainer.Line line3 = (GridContainer.Line) arrayList.get(i22);
                            if (i3 <= 0) {
                                GridContainer.Line.m17151b(line3, (m17142a / cellProjection3.f32981e) + line3.f32994b, 0.0f, 2);
                            } else if (line3.f32994b == 0 && !line3.m17153c()) {
                                GridContainer.Line.m17151b(line3, (m17142a / i3) + line3.f32994b, 0.0f, 2);
                            }
                            if (i22 == i23) {
                                break;
                            }
                            i22 = i28;
                        }
                    }
                    i20 = i21;
                }
                grid.m17144a(arrayList, sizeConstraint);
                grid.m17145b(arrayList);
                return arrayList;
            }
        });

        /* renamed from: e */
        @NotNull
        public final SizeConstraint f32987e = new SizeConstraint(0, 0, 3);

        /* renamed from: f */
        @NotNull
        public final SizeConstraint f32988f = new SizeConstraint(0, 0, 3);

        public Grid() {
        }

        /* renamed from: a */
        public final void m17144a(List<Line> list, SizeConstraint sizeConstraint) {
            int size = list.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (i3 < size) {
                int i5 = i3 + 1;
                Line line = list.get(i3);
                if (line.m17153c()) {
                    float f4 = line.f32995c;
                    f2 += f4;
                    f3 = Math.max(f3, line.f32994b / f4);
                } else {
                    i4 += line.f32994b;
                }
                i3 = i5;
            }
            int size2 = list.size();
            int i6 = 0;
            int i7 = 0;
            while (i6 < size2) {
                int i8 = i6 + 1;
                Line line2 = list.get(i6);
                i7 += line2.m17153c() ? (int) Math.ceil(line2.f32995c * f3) : line2.f32994b;
                i6 = i8;
            }
            float max = Math.max(0, Math.max(sizeConstraint.f32996a, i7) - i4) / f2;
            int size3 = list.size();
            while (i2 < size3) {
                int i9 = i2 + 1;
                Line line3 = list.get(i2);
                if (line3.m17153c()) {
                    Line.m17151b(line3, (int) Math.ceil(line3.f32995c * max), 0.0f, 2);
                }
                i2 = i9;
            }
        }

        /* renamed from: b */
        public final void m17145b(List<Line> list) {
            int size = list.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                int i4 = i2 + 1;
                Line line = list.get(i2);
                line.f32993a = i3;
                i3 += line.f32994b;
                i2 = i4;
            }
        }

        /* renamed from: c */
        public final int m17146c(List<Line> list) {
            if (list.isEmpty()) {
                return 0;
            }
            Line line = (Line) kotlin.collections.CollectionsKt.m31991D(list);
            return line.f32993a + line.f32994b;
        }

        @NotNull
        /* renamed from: d */
        public final List<Cell> m17147d() {
            return this.f32984b.m17184a();
        }

        @NotNull
        /* renamed from: e */
        public final List<Line> m17148e() {
            return this.f32985c.m17184a();
        }

        /* renamed from: f */
        public final int m17149f() {
            List<Cell> m17147d = m17147d();
            if (m17147d.isEmpty()) {
                return 0;
            }
            Cell cell = (Cell) kotlin.collections.CollectionsKt.m31991D(m17147d);
            return cell.f32976e + cell.f32974c;
        }

        @NotNull
        /* renamed from: g */
        public final List<Line> m17150g() {
            return this.f32986d.m17184a();
        }
    }

    /* compiled from: GridContainer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/widget/GridContainer$Line;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Line {

        /* renamed from: a */
        public int f32993a;

        /* renamed from: b */
        public int f32994b;

        /* renamed from: c */
        public float f32995c;

        /* renamed from: b */
        public static /* synthetic */ void m17151b(Line line, int i2, float f2, int i3) {
            if ((i3 & 1) != 0) {
                i2 = 0;
            }
            if ((i3 & 2) != 0) {
                f2 = 0.0f;
            }
            line.m17152a(i2, f2);
        }

        /* renamed from: a */
        public final void m17152a(int i2, float f2) {
            this.f32994b = Math.max(this.f32994b, i2);
            this.f32995c = Math.max(this.f32995c, f2);
        }

        /* renamed from: c */
        public final boolean m17153c() {
            return this.f32995c > 0.0f;
        }
    }

    /* compiled from: GridContainer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/widget/GridContainer$SizeConstraint;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class SizeConstraint {

        /* renamed from: a */
        public int f32996a;

        /* renamed from: b */
        public int f32997b;

        public SizeConstraint() {
            this(0, 0, 3);
        }

        public SizeConstraint(int i2, int i3, int i4) {
            i2 = (i4 & 1) != 0 ? 0 : i2;
            i3 = (i4 & 2) != 0 ? 32768 : i3;
            this.f32996a = i2;
            this.f32997b = i3;
        }

        /* renamed from: a */
        public final void m17154a(int i2) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode == Integer.MIN_VALUE) {
                this.f32996a = 0;
                this.f32997b = size;
            } else if (mode == 0) {
                this.f32996a = 0;
                this.f32997b = 32768;
            } else {
                if (mode != 1073741824) {
                    return;
                }
                this.f32996a = size;
                this.f32997b = size;
            }
        }
    }

    /* compiled from: GridContainer.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/core/widget/GridContainer$SpannedCellComparator;", "Ljava/util/Comparator;", "Lcom/yandex/div/core/widget/GridContainer$CellProjection;", "Lkotlin/Comparator;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class SpannedCellComparator implements Comparator<CellProjection> {

        /* renamed from: b */
        @NotNull
        public static final SpannedCellComparator f32998b = new SpannedCellComparator();

        @Override // java.util.Comparator
        public int compare(CellProjection cellProjection, CellProjection cellProjection2) {
            CellProjection lhs = cellProjection;
            CellProjection rhs = cellProjection2;
            Intrinsics.m32179h(lhs, "lhs");
            Intrinsics.m32179h(rhs, "rhs");
            if (lhs.m17143b() < rhs.m17143b()) {
                return 1;
            }
            return lhs.m17143b() > rhs.m17143b() ? -1 : 0;
        }
    }

    @JvmOverloads
    public GridContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.gravity = 51;
        this.f32969d = new Grid();
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2806R.styleable.f30863d, i2, 0);
            Intrinsics.m32178g(obtainStyledAttributes, "context.obtainStyledAttr…ntainer, defStyleAttr, 0)");
            try {
                setColumnCount(obtainStyledAttributes.getInt(1, 1));
                setGravity(obtainStyledAttributes.getInt(0, 51));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f32971f = true;
    }

    private final int getPaddingHorizontal() {
        return getPaddingRight() + getPaddingLeft();
    }

    private final int getPaddingVertical() {
        return getPaddingBottom() + getPaddingTop();
    }

    /* renamed from: g */
    public final void m17138g() {
        int i2 = this.f32970e;
        if (i2 != 0) {
            if (i2 != m17139i()) {
                m17140j();
                m17138g();
                return;
            }
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            int i4 = i3 + 1;
            View child = getChildAt(i3);
            Intrinsics.m32178g(child, "child");
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            if (divLayoutParams.f33960e < 0 || divLayoutParams.f33961f < 0) {
                throw new IllegalStateException("Negative spans are not supported.");
            }
            if (divLayoutParams.f33959d < 0.0f || divLayoutParams.f33958c < 0.0f) {
                throw new IllegalStateException("Negative weights are not supported.");
            }
            i3 = i4;
        }
        this.f32970e = m17139i();
    }

    public final int getColumnCount() {
        return this.f32969d.f32983a;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getRowCount() {
        return this.f32969d.m17149f();
    }

    /* renamed from: i */
    public final int m17139i() {
        int childCount = getChildCount();
        int i2 = 223;
        int i3 = 0;
        while (i3 < childCount) {
            int i4 = i3 + 1;
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                i2 = (i2 * 31) + ((DivLayoutParams) layoutParams).hashCode();
            }
            i3 = i4;
        }
        return i2;
    }

    /* renamed from: j */
    public final void m17140j() {
        this.f32970e = 0;
        Grid grid = this.f32969d;
        grid.f32984b.f33060b = null;
        grid.f32985c.f33060b = null;
        grid.f32986d.f33060b = null;
    }

    /* renamed from: k */
    public final void m17141k(View view, int i2, int i3, int i4, int i5, int i6, int i7) {
        int m17411a;
        int m17411a2;
        if (i4 == -1) {
            m17411a = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else {
            DivViewGroup.Companion companion = DivViewGroup.f33964b;
            int minimumWidth = view.getMinimumWidth();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            m17411a = companion.m17411a(i2, 0, i4, minimumWidth, ((DivLayoutParams) layoutParams).f33963h);
        }
        if (i5 == -1) {
            m17411a2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else {
            DivViewGroup.Companion companion2 = DivViewGroup.f33964b;
            int minimumHeight = view.getMinimumHeight();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            m17411a2 = companion2.m17411a(i3, 0, i5, minimumHeight, ((DivLayoutParams) layoutParams2).f33962g);
        }
        view.measure(m17411a, m17411a2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        GridContainer gridContainer = this;
        SystemClock.elapsedRealtime();
        m17138g();
        List<Line> m17148e = gridContainer.f32969d.m17148e();
        List<Line> m17150g = gridContainer.f32969d.m17150g();
        List<Cell> m17147d = gridContainer.f32969d.m17147d();
        int i6 = gridContainer.gravity & 7;
        Grid grid = gridContainer.f32969d;
        Resettable<List<Line>> resettable = grid.f32985c;
        int i7 = 0;
        int i8 = 1;
        int m17146c = resettable.f33060b != null ? grid.m17146c(resettable.m17184a()) : 0;
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingLeft = i6 != 1 ? i6 != 5 ? getPaddingLeft() : (getPaddingLeft() + measuredWidth) - m17146c : C0000a.m5b(measuredWidth, m17146c, 2, getPaddingLeft());
        int i9 = gridContainer.gravity & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        Grid grid2 = gridContainer.f32969d;
        Resettable<List<Line>> resettable2 = grid2.f32986d;
        int m17146c2 = resettable2.f33060b != null ? grid2.m17146c(resettable2.m17184a()) : 0;
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : (getPaddingTop() + measuredHeight) - m17146c2 : C0000a.m5b(measuredHeight, m17146c2, 2, getPaddingTop());
        int childCount = getChildCount();
        while (i7 < childCount) {
            int i10 = i7 + 1;
            View childAt = gridContainer.getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                Cell cell = m17147d.get(i7);
                int i11 = m17148e.get(cell.f32973b).f32993a + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                int i12 = m17150g.get(cell.f32974c).f32993a + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                Line line = m17148e.get((cell.f32973b + cell.f32975d) - i8);
                int i13 = ((line.f32993a + line.f32994b) - i11) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
                Line line2 = m17150g.get((cell.f32974c + cell.f32976e) - i8);
                int i14 = ((line2.f32993a + line2.f32994b) - i12) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                int measuredWidth2 = childAt.getMeasuredWidth();
                int i15 = divLayoutParams.f33956a & 7;
                if (i15 == 1) {
                    i11 = C0000a.m5b(i13, measuredWidth2, 2, i11);
                } else if (i15 == 5) {
                    i11 = (i11 + i13) - measuredWidth2;
                }
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i16 = divLayoutParams.f33956a & C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                if (i16 == 16) {
                    i12 = C0000a.m5b(i14, measuredHeight2, 2, i12);
                } else if (i16 == 80) {
                    i12 = (i12 + i14) - measuredHeight2;
                }
                int i17 = i11 + paddingLeft;
                int i18 = i12 + paddingTop;
                childAt.layout(i17, i18, childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + i18);
            }
            i8 = 1;
            gridContainer = this;
            i7 = i10;
        }
        SystemClock.elapsedRealtime();
        KLog kLog = KLog.f33717a;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        List<Line> list;
        List<Line> list2;
        List<Cell> list3;
        int i7;
        List<Line> list4;
        List<Cell> list5;
        int i8;
        SystemClock.elapsedRealtime();
        m17138g();
        Grid grid = this.f32969d;
        grid.f32985c.f33060b = null;
        grid.f32986d.f33060b = null;
        int paddingHorizontal = getPaddingHorizontal();
        int paddingVertical = getPaddingVertical();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2 - paddingHorizontal), View.MeasureSpec.getMode(i2));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3 - paddingVertical), View.MeasureSpec.getMode(i3));
        int childCount = getChildCount();
        int i9 = 0;
        while (true) {
            i4 = -1;
            i5 = 8;
            if (i9 >= childCount) {
                break;
            }
            int i10 = i9 + 1;
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                i8 = childCount;
            } else {
                DivViewGroup.Companion companion = DivViewGroup.f33964b;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int i11 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
                int i12 = i11 == -1 ? 0 : i11;
                int i13 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
                int i14 = i13 == -1 ? 0 : i13;
                int minimumWidth = childAt.getMinimumWidth();
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                int m17411a = companion.m17411a(makeMeasureSpec, 0, i12, minimumWidth, ((DivLayoutParams) layoutParams2).f33963h);
                int minimumHeight = childAt.getMinimumHeight();
                ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                i8 = childCount;
                childAt.measure(m17411a, companion.m17411a(makeMeasureSpec2, 0, i14, minimumHeight, ((DivLayoutParams) layoutParams3).f33962g));
            }
            i9 = i10;
            childCount = i8;
        }
        Grid grid2 = this.f32969d;
        grid2.f32987e.m17154a(makeMeasureSpec);
        int max = Math.max(grid2.f32987e.f32996a, Math.min(grid2.m17146c(grid2.m17148e()), grid2.f32987e.f32997b));
        List<Cell> m17147d = this.f32969d.m17147d();
        List<Line> m17148e = this.f32969d.m17148e();
        int childCount2 = getChildCount();
        int i15 = 0;
        while (i15 < childCount2) {
            int i16 = i15 + 1;
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != i5) {
                ViewGroup.LayoutParams layoutParams4 = childAt2.getLayoutParams();
                Objects.requireNonNull(layoutParams4, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams4;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams2).width == i4) {
                    Cell cell = m17147d.get(i15);
                    i7 = childCount2;
                    Line line = m17148e.get(cell.f32973b + cell.f32975d + i4);
                    list4 = m17148e;
                    list5 = m17147d;
                    m17141k(childAt2, makeMeasureSpec, makeMeasureSpec2, ((ViewGroup.MarginLayoutParams) divLayoutParams2).width, ((ViewGroup.MarginLayoutParams) divLayoutParams2).height, ((line.f32993a + line.f32994b) - m17148e.get(cell.f32973b).f32993a) - divLayoutParams2.m17409a(), 0);
                    i15 = i16;
                    m17147d = list5;
                    childCount2 = i7;
                    m17148e = list4;
                    i5 = 8;
                    i4 = -1;
                }
            }
            i7 = childCount2;
            list4 = m17148e;
            list5 = m17147d;
            i15 = i16;
            m17147d = list5;
            childCount2 = i7;
            m17148e = list4;
            i5 = 8;
            i4 = -1;
        }
        Grid grid3 = this.f32969d;
        grid3.f32988f.m17154a(makeMeasureSpec2);
        int max2 = Math.max(grid3.f32988f.f32996a, Math.min(grid3.m17146c(grid3.m17150g()), grid3.f32988f.f32997b));
        List<Cell> m17147d2 = this.f32969d.m17147d();
        List<Line> m17148e2 = this.f32969d.m17148e();
        List<Line> m17150g = this.f32969d.m17150g();
        int childCount3 = getChildCount();
        int i17 = 0;
        while (i17 < childCount3) {
            int i18 = i17 + 1;
            View childAt3 = getChildAt(i17);
            if (childAt3.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams5 = childAt3.getLayoutParams();
                Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams3 = (DivLayoutParams) layoutParams5;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams3).height == -1) {
                    Cell cell2 = m17147d2.get(i17);
                    i6 = childCount3;
                    Line line2 = m17148e2.get((cell2.f32973b + cell2.f32975d) - 1);
                    int m17409a = ((line2.f32993a + line2.f32994b) - m17148e2.get(cell2.f32973b).f32993a) - divLayoutParams3.m17409a();
                    Line line3 = m17150g.get((cell2.f32974c + cell2.f32976e) - 1);
                    list = m17150g;
                    list2 = m17148e2;
                    list3 = m17147d2;
                    m17141k(childAt3, makeMeasureSpec, makeMeasureSpec2, ((ViewGroup.MarginLayoutParams) divLayoutParams3).width, ((ViewGroup.MarginLayoutParams) divLayoutParams3).height, m17409a, ((line3.f32993a + line3.f32994b) - m17150g.get(cell2.f32974c).f32993a) - divLayoutParams3.m17410b());
                    i17 = i18;
                    childCount3 = i6;
                    m17147d2 = list3;
                    m17148e2 = list2;
                    m17150g = list;
                }
            }
            i6 = childCount3;
            list = m17150g;
            list2 = m17148e2;
            list3 = m17147d2;
            i17 = i18;
            childCount3 = i6;
            m17147d2 = list3;
            m17148e2 = list2;
            m17150g = list;
        }
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(max + paddingHorizontal, getSuggestedMinimumWidth()), i2, 0), ViewGroup.resolveSizeAndState(Math.max(max2 + paddingVertical, getSuggestedMinimumHeight()), i3, 0));
        SystemClock.elapsedRealtime();
        KLog kLog = KLog.f33717a;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(@NotNull View child) {
        Intrinsics.m32179h(child, "child");
        super.onViewAdded(child);
        m17140j();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(@NotNull View child) {
        Intrinsics.m32179h(child, "child");
        super.onViewRemoved(child);
        m17140j();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.f32971f) {
            Grid grid = this.f32969d;
            grid.f32985c.f33060b = null;
            grid.f32986d.f33060b = null;
        }
    }

    public final void setColumnCount(int i2) {
        Grid grid = this.f32969d;
        Objects.requireNonNull(grid);
        if (i2 > 0 && grid.f32983a != i2) {
            grid.f32983a = i2;
            grid.f32984b.f33060b = null;
            grid.f32985c.f33060b = null;
            grid.f32986d.f33060b = null;
        }
        m17140j();
        requestLayout();
    }

    public final void setGravity(int i2) {
        this.gravity = i2;
        requestLayout();
    }
}
