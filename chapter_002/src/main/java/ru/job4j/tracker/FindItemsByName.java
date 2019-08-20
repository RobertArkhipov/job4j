package ru.job4j.tracker;

class FindItemsByName extends BaseAction {

   public FindItemsByName(int key, String name) {
       super(key, name);
   }


    /**
     * Метод реализует поиск заявки по имени.
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("--- Поиск завяки по имени ---");
        String name = input.ask("Введите имя заявки, которую нужно найти: ");
        System.out.println("--- Найдено: ---");
        for (Item item : tracker.findByName(name)) {
            System.out.println("Имя заявки: " + item.getName());
            System.out.println("Описание заявки: " + item.getDecs());
            System.out.println("ID заявки: " + item.getId());
            System.out.println("-------------------");
        }
    }
}
