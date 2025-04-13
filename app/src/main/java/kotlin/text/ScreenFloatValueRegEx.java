package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: StringNumberConversionsJVM.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/text/ScreenFloatValueRegEx;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class ScreenFloatValueRegEx {

    /* renamed from: a */
    @JvmField
    @NotNull
    public static final Regex f66899a = new Regex(C0000a.m16m("[\\x00-\\x20]*[+-]?(NaN|Infinity|((", "((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+))", ")[fFdD]?))[\\x00-\\x20]*"));
}
