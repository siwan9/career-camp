document.addEventListener('DOMContentLoaded', () => {

    const alert =
        document.querySelector('.success-alert');

    if (!alert) {
        return;
    }

    setTimeout(() => {

        bootstrap.Alert
            .getOrCreateInstance(alert)
            .close();

    }, 3000);

});