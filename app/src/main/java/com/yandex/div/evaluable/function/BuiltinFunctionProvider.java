package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionProvider;
import com.yandex.div.evaluable.VariableProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BuiltinFunctionProvider.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/evaluable/function/BuiltinFunctionProvider;", "Lcom/yandex/div/evaluable/FunctionProvider;", "div-evaluable"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class BuiltinFunctionProvider implements FunctionProvider {

    /* renamed from: a */
    @NotNull
    public final FunctionRegistry f33193a;

    public BuiltinFunctionProvider(@NotNull VariableProvider variableProvider) {
        FunctionRegistry functionRegistry = new FunctionRegistry();
        this.f33193a = functionRegistry;
        functionRegistry.m17242b(IntegerSum.f33459c);
        functionRegistry.m17242b(DoubleSum.f33312c);
        functionRegistry.m17242b(IntegerSub.f33455c);
        functionRegistry.m17242b(DoubleSub.f33308c);
        functionRegistry.m17242b(IntegerMul.f33447c);
        functionRegistry.m17242b(DoubleMul.f33296c);
        functionRegistry.m17242b(IntegerDiv.f33429c);
        functionRegistry.m17242b(DoubleDiv.f33274c);
        functionRegistry.m17242b(IntegerMod.f33443c);
        functionRegistry.m17242b(DoubleMod.f33292c);
        functionRegistry.m17242b(IntegerMaxValue.f33437c);
        functionRegistry.m17242b(IntegerMinValue.f33442c);
        functionRegistry.m17242b(DoubleMaxValue.f33286c);
        functionRegistry.m17242b(DoubleMinValue.f33291c);
        functionRegistry.m17242b(IntegerMax.f33433c);
        functionRegistry.m17242b(DoubleMax.f33282c);
        functionRegistry.m17242b(IntegerMin.f33438c);
        functionRegistry.m17242b(DoubleMin.f33287c);
        functionRegistry.m17242b(IntegerAbs.f33421c);
        functionRegistry.m17242b(DoubleAbs.f33262c);
        functionRegistry.m17242b(IntegerSignum.f33451c);
        functionRegistry.m17242b(DoubleSignum.f33304c);
        functionRegistry.m17242b(IntegerCopySign.f33425c);
        functionRegistry.m17242b(DoubleCopySign.f33270c);
        functionRegistry.m17242b(DoubleCeil.f33266c);
        functionRegistry.m17242b(DoubleFloor.f33278c);
        functionRegistry.m17242b(DoubleRound.f33300c);
        functionRegistry.m17242b(ColorAlphaComponentGetter.f33194g);
        functionRegistry.m17242b(ColorStringAlphaComponentGetter.f33234g);
        functionRegistry.m17242b(ColorRedComponentGetter.f33224g);
        functionRegistry.m17242b(ColorStringRedComponentGetter.f33254g);
        functionRegistry.m17242b(ColorGreenComponentGetter.f33218g);
        functionRegistry.m17242b(ColorStringGreenComponentGetter.f33250g);
        functionRegistry.m17242b(ColorBlueComponentGetter.f33204g);
        functionRegistry.m17242b(ColorStringBlueComponentGetter.f33238g);
        functionRegistry.m17242b(ColorAlphaComponentSetter.f33197g);
        functionRegistry.m17242b(ColorStringAlphaComponentSetter.f33236g);
        functionRegistry.m17242b(ColorRedComponentSetter.f33227g);
        functionRegistry.m17242b(ColorStringRedComponentSetter.f33256g);
        functionRegistry.m17242b(ColorGreenComponentSetter.f33221g);
        functionRegistry.m17242b(ColorStringGreenComponentSetter.f33252g);
        functionRegistry.m17242b(ColorBlueComponentSetter.f33207g);
        functionRegistry.m17242b(ColorStringBlueComponentSetter.f33240g);
        functionRegistry.m17242b(ColorArgb.f33200c);
        functionRegistry.m17242b(ColorRgb.f33230c);
        functionRegistry.m17242b(ParseUnixTime.f33500c);
        functionRegistry.m17242b(ParseUnixTimeAsLocal.f33504c);
        functionRegistry.m17242b(NowLocal.f33475c);
        functionRegistry.m17242b(AddMillis.f33181c);
        functionRegistry.m17242b(SetYear.f33532c);
        functionRegistry.m17242b(SetMonth.f33524c);
        functionRegistry.m17242b(SetDay.f33508c);
        functionRegistry.m17242b(SetHours.f33512c);
        functionRegistry.m17242b(SetMinutes.f33520c);
        functionRegistry.m17242b(SetSeconds.f33528c);
        functionRegistry.m17242b(SetMillis.f33516c);
        functionRegistry.m17242b(GetYear.f33417c);
        functionRegistry.m17242b(GetMonth.f33401c);
        functionRegistry.m17242b(GetDay.f33345c);
        functionRegistry.m17242b(GetDayOfWeek.f33349c);
        functionRegistry.m17242b(GetHours.f33353c);
        functionRegistry.m17242b(GetMinutes.f33397c);
        functionRegistry.m17242b(GetSeconds.f33409c);
        functionRegistry.m17242b(GetMillis.f33393c);
        functionRegistry.m17242b(FormatDateAsLocal.f33316c);
        functionRegistry.m17242b(FormatDateAsUTC.f33324c);
        functionRegistry.m17242b(FormatDateAsLocalWithLocale.f33320c);
        functionRegistry.m17242b(FormatDateAsUTCWithLocale.f33328c);
        functionRegistry.m17242b(GetIntervalTotalWeeks.f33389c);
        functionRegistry.m17242b(GetIntervalTotalDays.f33373c);
        functionRegistry.m17242b(GetIntervalTotalHours.f33377c);
        functionRegistry.m17242b(GetIntervalHours.f33361c);
        functionRegistry.m17242b(GetIntervalTotalMinutes.f33381c);
        functionRegistry.m17242b(GetIntervalMinutes.f33365c);
        functionRegistry.m17242b(GetIntervalTotalSeconds.f33385c);
        functionRegistry.m17242b(GetIntervalSeconds.f33369c);
        functionRegistry.m17242b(StringLength.f33556c);
        functionRegistry.m17242b(StringContains.f33536c);
        functionRegistry.m17242b(StringSubstring.f33564c);
        functionRegistry.m17242b(StringReplaceAll.f33560c);
        functionRegistry.m17242b(StringIndex.f33548c);
        functionRegistry.m17242b(StringLastIndex.f33552c);
        functionRegistry.m17242b(StringEncodeUri.f33544c);
        functionRegistry.m17242b(StringDecodeUri.f33540c);
        functionRegistry.m17242b(ToLowerCase.f33580c);
        functionRegistry.m17242b(ToUpperCase.f33584c);
        functionRegistry.m17242b(Trim.f33588c);
        functionRegistry.m17242b(TrimLeft.f33592c);
        functionRegistry.m17242b(TrimRight.f33596c);
        functionRegistry.m17242b(PadStartString.f33496c);
        functionRegistry.m17242b(PadStartInteger.f33492c);
        functionRegistry.m17242b(PadEndString.f33488c);
        functionRegistry.m17242b(PadEndInteger.f33484c);
        functionRegistry.m17242b(NumberToInteger.f33476c);
        functionRegistry.m17242b(BooleanToInteger.f33185c);
        functionRegistry.m17242b(StringToInteger.f33572c);
        functionRegistry.m17242b(IntegerToNumber.f33467c);
        functionRegistry.m17242b(StringToNumber.f33576c);
        functionRegistry.m17242b(IntegerToBoolean.f33463c);
        functionRegistry.m17242b(StringToBoolean.f33568c);
        functionRegistry.m17242b(IntegerToString.f33471c);
        functionRegistry.m17242b(NumberToString.f33480c);
        functionRegistry.m17242b(BooleanToString.f33189c);
        functionRegistry.m17242b(ColorToString.f33258c);
        functionRegistry.m17242b(new GetIntegerValue(variableProvider));
        functionRegistry.m17242b(new GetNumberValue(variableProvider));
        functionRegistry.m17242b(new GetStringValue(variableProvider));
        functionRegistry.m17242b(new GetColorValueString(variableProvider));
        functionRegistry.m17242b(new GetColorValue(variableProvider));
        functionRegistry.m17242b(new GetBooleanValue(variableProvider));
    }

    @Override // com.yandex.div.evaluable.FunctionProvider
    @NotNull
    /* renamed from: a */
    public Function mo17237a(@NotNull String name, @NotNull List<? extends EvaluableType> list) {
        Intrinsics.m32179h(name, "name");
        return this.f33193a.mo17237a(name, list);
    }
}
