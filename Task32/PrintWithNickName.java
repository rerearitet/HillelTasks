package task32;

@FunctionalInterface
public interface PrintWithNickName<T> { //вместо спец символа никнейм
    void print(T message, T nickName);
}
