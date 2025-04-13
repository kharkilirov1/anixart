package lecho.lib.hellocharts.formatter;

import java.util.Objects;
import lecho.lib.hellocharts.model.AxisValue;

/* loaded from: classes3.dex */
public class SimpleAxisValueFormatter implements AxisValueFormatter {

    /* renamed from: a */
    public ValueFormatterHelper f68518a;

    public SimpleAxisValueFormatter() {
        ValueFormatterHelper valueFormatterHelper = new ValueFormatterHelper();
        this.f68518a = valueFormatterHelper;
        valueFormatterHelper.m34429a();
    }

    @Override // lecho.lib.hellocharts.formatter.AxisValueFormatter
    /* renamed from: a */
    public int mo34427a(char[] cArr, AxisValue axisValue) {
        ValueFormatterHelper valueFormatterHelper = this.f68518a;
        Objects.requireNonNull(axisValue);
        return valueFormatterHelper.m34430b(cArr, 0.0f, 0, null);
    }

    @Override // lecho.lib.hellocharts.formatter.AxisValueFormatter
    /* renamed from: b */
    public int mo34428b(char[] cArr, float f2, int i2) {
        return this.f68518a.m34430b(cArr, f2, i2, null);
    }
}
