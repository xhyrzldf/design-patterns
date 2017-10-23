package com.lambda.functionutils;

import java.util.function.*;

/**
 * 函数方法引用转换工具类
 * @author Matrix
 */
@SuppressWarnings("unused")
public class FunctionCastUtil {
    public static <T, U> BiConsumer<T, U> asBiConsumer(BiConsumer<T, U> biConsumer) {
        return biConsumer;
    }

    public static <T, U, R> BiFunction<T, U, R> asBiFunction(BiFunction<T, U, R> biFunction) {
        return biFunction;
    }

    public static <T> BinaryOperator<T> asBinaryOperator(BinaryOperator<T> binaryOperator) {
        return binaryOperator;
    }

    public static <T, U> BiPredicate<T, U> asBiPredicate(BiPredicate<T, U> biPredicate) {
        return biPredicate;
    }

    public static BooleanSupplier asBooleanSupplier(BooleanSupplier booleanSupplier) {
        return booleanSupplier;
    }

    public static <T> Consumer<T> asConsumer(Consumer<T> consumer) {
        return consumer;
    }

    public static DoubleBinaryOperator asDoubleBinaryOperator(DoubleBinaryOperator doubleBinaryOperator) {
        return doubleBinaryOperator;
    }

    public static DoubleConsumer asDoubleConsumer(DoubleConsumer doubleConsumer) {
        return doubleConsumer;
    }

    public static <R> DoubleFunction<R> asDoubleFunction(DoubleFunction<R> doubleFunction) {
        return doubleFunction;
    }

    public static DoublePredicate asDoublePredicate(DoublePredicate doublePredicate) {
        return doublePredicate;
    }

    public static DoubleToIntFunction asDoubleToIntFunction(DoubleToIntFunction doubleToIntFunctiontem) {
        return doubleToIntFunctiontem;
    }

    public static DoubleToLongFunction asDoubleToLongFunction(DoubleToLongFunction doubleToLongFunction) {
        return doubleToLongFunction;
    }

    public static DoubleUnaryOperator asDoubleUnaryOperator(DoubleUnaryOperator doubleUnaryOperator) {
        return doubleUnaryOperator;
    }

    public static <T, R> Function<T, R> asFunction(Function<T, R> function) {
        return function;
    }

    public static IntBinaryOperator asIntBinaryOperator(IntBinaryOperator intBinaryOperator) {
        return intBinaryOperator;
    }

    public static IntConsumer asIntConsumer(IntConsumer intConsumer) {
        return intConsumer;
    }

    public static <R> IntFunction<R> asIntFunction(IntFunction<R> intFunction) {
        return intFunction;
    }

    public static IntPredicate asIntPredicate(IntPredicate intPredicate) {
        return intPredicate;
    }

    public static IntSupplier asIntSupplier(IntSupplier intSupplier) {
        return intSupplier;
    }

    public static IntToDoubleFunction asIntToDoubleFunction(IntToDoubleFunction intToDoubleFunction) {
        return intToDoubleFunction;
    }

    public static IntToLongFunction asIntToLongFunction(IntToLongFunction intToLongFunction) {
        return intToLongFunction;
    }

    public static IntUnaryOperator asIntUnaryOperator(IntUnaryOperator intUnaryOperator) {
        return intUnaryOperator;
    }

    public static LongBinaryOperator asLongBinaryOperator(LongBinaryOperator longBinaryOperator) {
        return longBinaryOperator;
    }

    public static LongConsumer asLongConsumer(LongConsumer longConsumer) {
        return longConsumer;
    }

    public static <R> LongFunction<R> asLongFunction(LongFunction<R> longFunction) {
        return longFunction;
    }

    public static LongPredicate asLongPredicate(LongPredicate longPredicate) {
        return longPredicate;
    }

    public static <T> LongSupplier asLongSupplier(LongSupplier longSupplier) {
        return longSupplier;
    }

    public static LongToDoubleFunction asLongToDoubleFunction(LongToDoubleFunction longToDoubleFunction) {
        return longToDoubleFunction;
    }

    public static LongToIntFunction asLongToIntFunction(LongToIntFunction longToIntFunction) {
        return longToIntFunction;
    }

    public static LongUnaryOperator asLongUnaryOperator(LongUnaryOperator longUnaryOperator) {
        return longUnaryOperator;
    }

    public static <T> ObjDoubleConsumer<T> asObjDoubleConsumer(ObjDoubleConsumer<T> objDoubleConsumer) {
        return objDoubleConsumer;
    }

    public static <T> ObjIntConsumer<T> asObjIntConsumer(ObjIntConsumer<T> objIntConsumer) {
        return objIntConsumer;
    }

    public static <T> ObjLongConsumer<T> asObjLongConsumer(ObjLongConsumer<T> objLongConsumer) {
        return objLongConsumer;
    }

    public static <T> Predicate<T> asPredicate(Predicate<T> predicate) {
        return predicate;
    }

    public static <T> Supplier<T> asSupplier(Supplier<T> supplier) {
        return supplier;
    }

    public static <T, U> ToDoubleBiFunction<T, U> asToDoubleBiFunction(ToDoubleBiFunction<T, U> toDoubleBiFunction) {
        return toDoubleBiFunction;
    }

    public static <T> ToDoubleFunction<T> asToDoubleFunction(ToDoubleFunction<T> toDoubleFunction) {
        return toDoubleFunction;
    }

    public static <T, U> ToIntBiFunction<T, U> asToIntBiFunction(ToIntBiFunction<T, U> toIntBiFunction) {
        return toIntBiFunction;
    }

    public static <T> ToIntFunction<T> asToIntFunction(ToIntFunction<T> ioIntFunction) {
        return ioIntFunction;
    }

    public static <T, U> ToLongBiFunction<T, U> asToLongBiFunction(ToLongBiFunction<T, U> toLongBiFunction) {
        return toLongBiFunction;
    }

    public static <T> ToLongFunction<T> asToLongFunction(ToLongFunction<T> toLongFunction) {
        return toLongFunction;
    }

    public static <T> UnaryOperator<T> asUnaryOperator(UnaryOperator<T> unaryOperator) {
        return unaryOperator;
    }

    private FunctionCastUtil() {
    }
}
