# 【Level4】

## テーマ
要件をもとに自力でCRUD機能が作成できること、自力でthymeleafの記述ができることを目標に演習に取り組みましょう。

## 演習課題の準備（開発環境について）
* この演習では、Codespacesと呼ばれるサービスを使って開発を行います。
* ブラウザ上で動作する開発環境です、インストール不要で使う事ができます。
* レベル0で実施した[手順](/Codespacesの実行手順.md)を参照して、演習課題の準備をしましょう。

## 演習内容
TODOリスト機能を実装しましょう。

## 演習内容詳細
![4_main](https://user-images.githubusercontent.com/32722128/191921680-6d366bed-1433-4f94-865c-6fc66d91a426.gif)

TODOの管理を行う機能を実装しましょう、これまでの演習内容を参考に取り組みましょう。  
以下の機能を実装してください、全て1つのページで完結するように作成しましょう。  
ビューのテンプレートファイルは既に用意されている物を使用してください。  
`src\main\resources\templates\todo\index.html`に配置されています。  
modelオブジェクトへ値を格納する際に使用する属性名は、テンプレートファイルを参照し、適切なものを設定してください。

## 実装する機能について
1. 表示機能
`/todo`のパスのページを参照した際に表示される画面に、TODOの一覧を表示してください。
![4_dashboard_to_todo](https://user-images.githubusercontent.com/32722128/191921646-d1a0948e-da1e-4ff3-9955-f0230f29e251.gif)

2. 登録機能
入力欄に入力された内容をTODOとして登録出来るようにしてください。
![4_todo_insert](https://user-images.githubusercontent.com/32722128/191921693-6d9df655-5a10-4442-9a9f-257c240d88b9.gif)

3. 更新機能(TODOの完了未完了)
表示されたTODOのチェックボタンの状態を保持して下さい、チェックボタンを押すたびに`TODO`テーブルの`checked`カラムの値を更新してください。
![4_update](https://user-images.githubusercontent.com/32722128/191921699-c4cf85c5-aa10-49e6-8752-bef812f0af5f.gif)

4. 削除機能
削除ボタンが押された行のレコードを`TODO`テーブルから物理削除してください。
![4_delete](https://user-images.githubusercontent.com/32722128/191921671-eee472e7-1da0-4523-99eb-dc9bae8f6691.gif)

5. 未完了のTODOのDashboardへの表示機能
未完了のTODOをDashboardページに表示してしてください。
![4_dashboard_view](https://user-images.githubusercontent.com/32722128/191921659-ff960832-a793-40a2-b78c-6c82b16d728b.gif)

6. バリデーションチェック機能
TODOを入力せずに登録ボタンを押した際に、「入力してください」とメッセージが出るようにしてください。
![4_validation_check](https://user-images.githubusercontent.com/32722128/191921712-84baf920-f996-493a-92ad-16deef30b4bb.gif)

7. エラーハンドリング機能
以下のエラー時に、指定された例外クラスの例外をthrowしてください。  

## 課題の提出
* 課題の提出は[課題提出の操作](/課題の提出手順.md)のコミット・プッシュ・プルリクエストを実施しましょう。
