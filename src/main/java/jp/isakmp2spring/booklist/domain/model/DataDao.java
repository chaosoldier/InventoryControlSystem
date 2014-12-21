package jp.isakmp2spring.booklist.domain.model;

import java.io.Serializable;
import java.util.List;

public interface DataDao <T> extends Serializable {
	
	public List<T> getAll();//全エンティティを取得する
	public T findById(long id);//ID番号を引数にしてエンティティを取得　えんてぃてぃ取得の基本となるもの
	public List<T> findByName(String name);//名前からエンティティを検索すsる
	public void add(T data);//エンティティを保存する
	public void	update(T data);//えんてぃてぃを更新する
	public void delete(T data);//引数に渡されたエンティティを削除する
	public void delete(long id);//IDを元にして削除する.
	public List<T> find(String fstr);
}
